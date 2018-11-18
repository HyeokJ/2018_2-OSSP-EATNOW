package eatnow.my;

public class customer {
	private String name;
	private String phone;
		
	public customer(String r_name,String r_phone)
	{
		this.name = r_name;
		this.phone = r_phone;
	}
	public String get_name() {
		return name;
	}
	public void set_name(String _name) {
		this.name = _name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}

