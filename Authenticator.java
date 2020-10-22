import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Authenticator {

	public static void main(String[] args) {
		Scanner file = null;
		
		Scanner keyboard = new Scanner(System.in);
		
		try {
			file = new Scanner(new FileInputStream("login.txt"));
		}
		catch (FileNotFoundException e){
			System.out.println("File not found.");
			System.exit(0);
		}
		
		String username1 = file.next();
		String password1 = file.next();
		
		String username2 = file.next();
		String password2 = file.next();
		
		String username3 = file.next();
		String password3 = file.next();
		
		System.out.println("Please enter your username and password seperated by a space:");
		String inputusername = keyboard.next();
		String inputpassword = keyboard.next();
		
		if (inputusername.equals(username1)) {
			if (inputpassword.equals(password1)) {
				System.out.println("You have successfully logged in... Welcome!!");
			}
			else
			{
				System.out.println("Sorry, incorrect login information. Access denied.");
			}
		}
		else if (inputusername.equals(username2)) {
			if (inputpassword.equals(password2)) {
				System.out.println("You have successfully logged in... Welcome!!");
			}
			else
			{
				System.out.println("Sorry, incorrect login information. Access denied.");
			}
		}
		else if (inputusername.equals(username3)) {
			if (inputpassword.equals(password3)) {
				System.out.println("You have successfully logged in... Welcome!!");
			}
			else
			{
				System.out.println("Sorry, incorrect login information. Access denied.");
			}
		}
		else
		{
			System.out.println("Sorry, incorrect login information. Access denied.");
		}
		
		file.close();
	} 

}
