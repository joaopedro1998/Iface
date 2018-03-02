package Iface;

public class Profile {
	private String cellphone_number;
	private String relationship;
	private String city;
	private String job;
	private String born;
	private String description;
	
	public void Set_CellPhoneNumber(String number)
	{
		this.cellphone_number = number;
	}
	
	public String Get_CellPhoneNumber()
	{
		return cellphone_number;
	}
	
	public void Set_relationship(String relationship)
	{
		this.relationship = relationship;
	}
	
	public String Get_relationship()
	{
		return relationship;
	}
	
	public void Set_city(String city)
	{
		this.city = city;
	}
	
	public String Get_city()
	{
		return city;
	}
	
	public void Set_job(String job)
	{
		this.job = job;
	}
	
	public String Get_job()
	{
		return job;
	}
	
	public void Set_born(String born)
	{
		this.born = born;
	}
	
	public String Get_born()
	{
		return born;
	}
	
	public void Set_description(String description)
	{
		this.description = description;
	}
	
	public String Get_description()
	{
		return description;
	}
	
	
}
