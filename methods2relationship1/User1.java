package methods2relationship1;


public class User1
{
	private String name,username,passwd;
	
	private  Contactdetail1 conde;
	public User1(String name, String username, String passwd,Contactdetail1 conde) {
		super();
		this.name = name;
		this.username = username;
		this.passwd = passwd;
		this.conde = conde;
	}
	public User1() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Contactdetail1 getContactdetil() {
		return conde;
	}
	public void setContactdetil(Contactdetail1 conde) {
		this.conde = conde;
	}
	@Override
	public String toString() {
		return "User Name:" + name + ", Username:" + username + ", Password=" + passwd + ", Contactdetil:" + conde + "";
	}
	
	
}
