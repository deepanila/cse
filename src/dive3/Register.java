package dive3;
import java.util.*;

public class Register {
	public static void main(String[] args)throws InvalidUser{
String[] username={"aaa","bbb","ccc"};
System.out.println("enter the user name");
Scanner s=new Scanner(System.in);
String user=s.nextLine();
for(int i=0;i<username.length;i++)
{
	if(username[i].equals(user))
	{
		System.out.println("user already exits");
	}
	else
	{
		throw new InvalidUser("Invalid pwd and username");
	}
}
	}

	public void setUsername(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
}
class InvalidUser extends Exception
	{
     InvalidUser(String message){
	super(message);
}
public void addUser(Register user){
	user.setUsername("admin");
	user.setPassword("admin");
}
public class User{
	String[] username;
	String[] password;
	public String[] getUsername() {
		return username;
	}
	public void setUsername(String[] username) {
		this.username = username;
	}
	public String[] getPassword() {
		return password;
	}
	public void setPassword(String[] password) {
		this.password = password;
	}
}
}