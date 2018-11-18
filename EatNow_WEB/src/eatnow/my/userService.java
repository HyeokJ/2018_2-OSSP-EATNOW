package eatnow.my;

public class userService {
	private MemberDAO memberAccess;
	
	public userService() {
		memberAccess=new MemberDAO();
	}
	public Boolean checkID(String id)
	{
		return memberAccess.idRetrieve(id);
	}
	public User getUser(String id, String password)
	{
		User user = null;
		try {
			user = memberAccess.userRetrieve( id, password);
		} catch (Exception e)
		{
			user = null;
		}
		return user;
	}
	public void joinUser(int mem_type, String id, String password, String name, int dob, String phone_num, String email_add)
	{
		memberAccess.registerUser(mem_type, id, password, name, dob, phone_num, email_add);
	}
	
}
