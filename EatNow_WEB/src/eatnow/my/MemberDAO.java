package eatnow.my;

import eatnow.my.DBUtil;


public class MemberDAO {
	
	private static final String rec_stmt
	="select * from member_info where id=? and password=?";
	private static final String recid_stmt
	="select * from member_info where id=?";
	private static final String rec_usernum_stmt
	="select count(id) from member_info";
	private static final String create_user_stmt
	="INSERT INTO member_info VALUES(?,?,?,?,?,?,?,?)";
	
	Boolean idRetrieve(String r_id) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Connection conn = DBUtil.getMySQLConnection();
			pstmt = conn.prepareStatement(recid_stmt);
			pstmt.setString(1, r_id);
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	User userRetrieve(String r_id, String r_password) {
	//사용자를 찾아서 사용자 객체를 만들어 return 하는 함수
		User user = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rows = 0;
		try {
			Connection conn = DBUtil.getMySQLConnection();
			pstmt = conn.prepareStatement(rec_stmt);
			pstmt.setString(1, r_id);
			pstmt.setString(2, r_password);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				int mem_type= rs.getInt("mem_type");
				String id = rs.getString("id");
				String password = rs.getString("password");
				int dob = rs.getInt("dob");
				String name = rs.getString("name");
				String phone_num = rs.getString("phone_num");
				String email_add = rs.getString("email_add");
				rows++; 
				if(rows>1) {//한명 이상의 정보를 가져올 경우
					throw new SQLException("잘 못 갖고옴");
				}
				user = new User(mem_type, id, password, name, dob, phone_num, email_add);
				
			}
			DBUtil.close(pstmt);
			DBUtil.close(rs);
			DBUtil.close(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	 void registerUser(int mem_type, String id, String password, String name, int dob, String phone_num, String email_add)
	{
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		try {
			Connection conn= DBUtil.getMySQLConnection();
			pstmt = conn.prepareStatement(rec_usernum_stmt);
			rs=pstmt.executeQuery();
			int user_num = -1;
			
			rs.next();
			user_num=rs.getInt(1);
			user_num++;
			pstmt = conn.prepareStatement(create_user_stmt);
			pstmt.setInt(1, user_num);
			pstmt.setInt(2, mem_type);
			pstmt.setString(3, id);
			pstmt.setString(4, name);
			pstmt.setString(5, password);
			pstmt.setInt(6,dob);
			pstmt.setString(7, email_add);
			pstmt.setString(8, phone_num);
			pstmt.executeUpdate();
			
			DBUtil.close(pstmt);
			DBUtil.close(rs);
			DBUtil.close(conn);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
