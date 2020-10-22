import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GroupAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner file = null;
		try {
			file = new Scanner(new FileInputStream("WeatherData.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
		
		String date1 = file.next();
		int temperature1 = file.nextInt();
		double rainfall1 = file.nextDouble();
		file.nextLine();
		
		String date2 = file.next();
		int temperature2 = file.nextInt();
		double rainfall2 = file.nextDouble();
		file.nextLine();
		
		String date3 = file.next();
		int temperature3 = file.nextInt();
		double rainfall3 = file.nextDouble();
		
		double tempaverage = ((temperature1 + temperature2 + temperature3)/3);
		double rainfalltotal = rainfall1 + rainfall2 + rainfall3;
		
		System.out.println("Here is the weather data for the past 3 days:");
		System.out.println(date1 + " " + temperature1 + " " + rainfall1);
		System.out.println(date2 + " " + temperature2 + " " + rainfall2);
		System.out.println(date3 + " " + temperature3 + " " + rainfall3);
		
		System.out.printf("The average temperature for the past 3 days was: %.2f %n", tempaverage);
		System.out.println("The total rainfall for the past 3 days was: " + rainfalltotal);
		
		file.close();
	}

}
