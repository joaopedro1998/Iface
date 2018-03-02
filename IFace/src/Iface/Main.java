package Iface;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		boolean working = true;
		MenuStatus flag = MenuStatus.Begin;
		Menu menu = new Menu();
		ArrayList<Users> users = new ArrayList<Users>();
		Users new_user;
		String login,password;
		
		while(working)
		{
			switch (flag) {
				case Begin :
					if(menu.begin() == 1)
						flag = MenuStatus.Login;
					else
						flag = MenuStatus.Register;
					break;
				case Login:
					login = menu.login();
					password = menu.password();
					for(Users user : users)
						if(user.Get_Login().equals(menu.login))
							if(user.Get_Password().equals(menu.password))
								System.out.println("Login efetuado");
					
						System.out.println("Login ou Senha incorreto!");
					break;
				case Register:
					new_user = new Users(menu.login(),menu.password(),menu.name());
					users.add(new_user);
					flag = MenuStatus.Begin;
					break;
				case Inside:
					if(menu.inside()==2)
						flag = MenuStatus.Add_Friends;
					break;
				case Add_Friends:
					menu.add_friends();
					System.out.println("Aguardando aceitacao de amizade por parte do seu amigo");
					break;
				case Create_Community:
					menu.Community_Name();
					menu.Community_Description();
					break;
				case EditProfile:
					menu.editProfile();
					break;
				case SendMessage:
					menu.messageReceiver();
					menu.sendMessage();
					break;
				default:
			}
			
		}
	}

	

	public enum MenuStatus {
	    Begin,
	    Login,
	    Register,
	    Inside,
	    Add_Friends,
	    EditProfile,
	    Create_Community,
	    SendMessage;
	}
	
}
