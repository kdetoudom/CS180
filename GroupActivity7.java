import java.util.Random;

public class GroupActivity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomgenerator = new Random();
		int sum = 0;
		int counter = 0;
		
		for (int player1, player2 = 0;;)
		{
			sum = 0;
			counter = 0;
			do
			{
				int diceroll1 = randomgenerator.nextInt(6) + 1;
				int diceroll2 = randomgenerator.nextInt(6) + 1;
				sum = diceroll1 + diceroll2 + sum;
				counter++;
				System.out.println("Dice roll number: " + counter);
				System.out.println("The sum currently is " + sum);
			} while (sum<50);
		}
		
		System.out.println("The sum of the dice rolls is: " + sum);
		System.out.println("The number of rolls it took was: " + counter);
	}

}
