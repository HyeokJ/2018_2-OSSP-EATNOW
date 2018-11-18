package eatnow.my;



public class User {
	private String id;
	private int mem_type;
	private String pwd;
	private String store_name;
	private int dob;
	private String phone;
	private String email;
	
	public User(int r_mem_type, String r_id, String r_pwd, String r_name, int r_dob, String r_phone, String r_email)
	{
		this.mem_type = r_mem_type;
		this.id = r_id;
		this.pwd = r_pwd;
		this.store_name = r_name;
		this.dob = r_dob;
		this.phone = r_phone;
		this.email = r_email;
	}
	
	public int getDob() {
		return dob;
	}
	public void setDob(int _dob) {
		this.dob=_dob;
	}
	public int getMem_type() { 
		return mem_type;
	}
	public void setMem_type(int _mem_type) {
		this.mem_type=_mem_type;
	}
	public String getId() {
		return id;
	}
	public void setId(String _id) {
		this.id = _id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String _pwd) {
		this.pwd = _pwd;
	}
	public String getstore_name() {
		return store_name;
	}
	public void setstore_name(String _name) {
		this.store_name = _name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
