package eatnow.my;

public class storeUser {
	private int mem_type;
	private String id;
	private String pwd;
	private String store_name;
	private int S_for_2;
	private int S_for_4;
	private int S_for_6;
	private int S_for_G;
	
	public storeUser(int r_mem_type, String r_id, String r_pwd, String r_name, int r_s_for_2, int r_s_for_4,int r_s_for_6,int r_s_for_G)
	{
		this.mem_type = r_mem_type;
		this.id = r_id;
		this.pwd = r_pwd;
		this.store_name = r_name;
		this.S_for_2 = r_s_for_2;
		this.S_for_4 = r_s_for_4;
		this.S_for_6 = r_s_for_6;
		this.S_for_G = r_s_for_G;
		
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
	public int getS_for_2()
	{
		return S_for_2;
	}
	public void setS_for_2(int _S_for_2)
	{
		this.S_for_2=_S_for_2;
	}
	public int getS_for_4()
	{
		return S_for_4;
	}
	public void setS_for_4(int _S_for_4)
	{
		this.S_for_4=_S_for_4;
	}
	public int getS_for_6()
	{
		return S_for_6;
	}
	public void setS_for_6(int _S_for_6)
	{
		this.S_for_6=_S_for_6;
	}
	public int getS_for_G()
	{
		return S_for_G;
	}
	public void setS_for_G(int _S_for_G)
	{
		this.S_for_G=_S_for_G;
	}
}
