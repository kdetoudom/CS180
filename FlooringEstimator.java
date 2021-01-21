//Name: Konnie Detoudom
//Project 6

import java.util.Scanner;

public class FlooringEstimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String material1 = "Oak Hard Wood";
		String material2 = "Maple Hard Wood";
		String material3 = "Plush Carpeting";
		String material4 = "Berbers Carpeting";
		
		System.out.println("Welcome to Frank's Flooring Company!!");
		System.out.println("We have the best prices for hardwood flooring and carpeting");
		System.out.println("Let's get an estimate on how much it would cost to renovate your home with new hardwood flooring or carpeting...");
		
		System.out.println("What type of flooring do you want to install?");
		String flooringInput = keyboard.nextLine();
		
		System.out.println("How many rooms are you looking to renovate?");
		int roomnumber = keyboard.nextInt();
		
		Rectangle[] rooms = new Rectangle[roomnumber];
		double totalCost = 0.00;
		double roomCost = 0.00;
		
		for (int i = 0; i < rooms.length; i++)
		{
			System.out.println("What is the length of the room?");
			double roomLength = keyboard.nextDouble();
			
			System.out.println("Whare is the width of the room?");
			double roomWidth = keyboard.nextDouble();
			
			rooms[i] = new Rectangle(roomLength, roomWidth);
			
			if (flooringInput.equals(material1))
			{
				roomCost = ((roomLength * roomWidth) * 15);
			}
			else if (flooringInput.equals(material2))
			{
				roomCost = ((roomLength * roomWidth) * 12);
			}
			else if (flooringInput.equals(material3))
			{
				roomCost = ((roomLength * roomWidth) * 8);
			}
			else if (flooringInput.equals(material4))
			{
				roomCost = ((roomLength * roomWidth) * 6);
			}
			
			System.out.println("The cost to renovate room " + (i + 1) + " is: $" + roomCost);
			
			totalCost = roomCost + totalCost;			
		}
		
		System.out.print("The cost to renovate " + roomnumber + "rooms with " + flooringInput + " is $");
		System.out.printf("%.2f", ((totalCost * .0625) + totalCost));
		}

}
