package Iface;


public class Users {
	
	Profile profile = new Profile();
	Friends friends = new Friends();
	private String login;
	private String password;
	private String name;
	
	public Users(String login, String password, String name)
	{
		this.login = login;
		this.password = password;
		this.name = name;
	}
	
	public String Get_Name()
	{
		return this.name;
	}
	
	public void Set_Name(String name)
	{
		this.name = name;
	}
	
	public String Get_Password()
	{
		return this.password;
	}
	
	public void Set_Password(String password)
	{
		this.password = password;
	}
	
	public String Get_Login()
	{
		return this.login;
	}
	
	public void Set_Login(String login)
	{
		this.login = login;
	}
}
