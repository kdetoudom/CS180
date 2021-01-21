import java.util.Scanner; 

public class CarlsKennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the Carls Kennel...");
		System.out.println("We board up to 10 puppies a day.");
		
		Puppy[] PupVisitors = new Puppy[10];
		
		for (int i=0; i< PupVisitors.length; i++)
		{
			System.out.println("Puppy Check-in...");
			
			System.out.println("Enter the pup's name: ");
			String PupName = keyboard.next();
			
			System.out.println("Enter the pup's breed: ");
			String PupBreed = keyboard.next();
			
			System.out.println("Enter the pup's age: ");
			int PupAge = keyboard.nextInt();
			
			System.out.println("Enter the pup's weight: ");
			double PupWeight = keyboard.nextDouble();
			
			PupVisitors[i] = new Puppy(PupName, PupBreed, PupAge, PupWeight);
		}
		
		for (int i=0; i < PupVisitors.length; i++)
		{
			System.out.println(PupVisitors[i].toString());
		}
		
		PupVisitors[2].setName("Rascal");
		PupVisitors[1].setAge(4);
		
	}

}
