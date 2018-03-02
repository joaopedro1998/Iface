package Iface;
import java.util.*;

public class Community {
	Users owner;
	ArrayList<Users> participant = new ArrayList<Users>(); 
	private String communityName;
	private String description;
	
	public Community(Users owner, String name, String description)
	{
		this.owner = owner;
		this.communityName = name;
		this.description = description;
	}
	
	public void Add_Participant(Users participant)
	{
		this.participant.add(participant);
	}
	
	
}
