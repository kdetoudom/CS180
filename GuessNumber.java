import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int number = 5;
		int counter = 0;
		
		System.out.println("Guess a number 1 through 10: ");
		
		int guess = keyboard.nextInt();
		
		do {
			System.out.println("That's incorrect, please try again.");
			counter += 1;
		} while (guess != number || counter >= 5);
		
		if (guess == number) {
			System.out.println("Congratulations, you got the right answer!");
		}
		else if (counter < 5) {
			System.out.println("You ran out of guesses. GAME OVER!");
		}
	}

}
