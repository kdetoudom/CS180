import java.util.Scanner;

public class GroupActivity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your test grades in the range 0 to 100:");
		
		int test1 = keyboard.nextInt();
		int test2 = keyboard.nextInt();
		
		if (0 < test1 && test1 <= 100) {
			if (0 < test2 && test2 <= 100) {
				System.out.println("Valid test grade for test1 and test2.");
			}
			else {
				System.out.println("Invalid test grade for test2.");
			}
			
		}
		else {
			System.out.println("Invalid test grade for test1.");
		}
	}

}
