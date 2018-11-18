package eatnow.my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.MBeanException;

public class DBUtil {

	public static Connection getMySQLConnection() {
	Connection conn = null;
		
		try {
			
		        Class.forName("com.mysql.jdbc.Driver");
		        String url = "jdbc:mysql://localhost:3306/member_info";
		        String user = "root";
		        String password = "920309";
		        conn = DriverManager.getConnection(url,user,password);
		        

		}catch(ClassNotFoundException e){
		        	System.out.println("MySQL ����̹��� �����ϴ�.<br/>");
		        }
		catch(SQLException e){
        	System.out.println("����� ���� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.<br/>");
        }
		return conn;
	}
	
	public static void close (Connection conn) {
		try{if(conn != null) {conn.close();}}catch(Exception e) {e.printStackTrace();}
	}
	public static void close (Statement stmt) {
		try{if(stmt != null) {stmt.close();}}catch(Exception e) {e.printStackTrace();}
	}
	public static void close(PreparedStatement pstmt) {
		try{if(pstmt != null) {pstmt.close();}}catch(Exception e) {e.printStackTrace();}
	}
	public static void close(ResultSet rs) {
		try{if(rs != null) {rs.close();}}catch(Exception e) {e.printStackTrace();}
	}
}