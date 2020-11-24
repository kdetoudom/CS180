// Name: Konnie Detoudom 
// Project 5

public class RectangleDemo {

	public static void main(String[] args) {
		System.out.println("This program will use the Rectangle class to create 4 rectangle objects that represent rooms in a house");
		System.out.println("It will use the methods of the Rectangle class to create rooms, set the measurements, and get the square footage.");
		
		// ------------------------------------- Bedroom 1 ----------------------------------------------
		//create a Rectangle object named bedroom1 by calling the 2-arg constructor and passing 10 and 10
		
		Rectangle bedroom1 = new Rectangle(10, 10);
		
		//calculate the area of bedroom1 and save it in a variable named bedroom1SquareFeet
		
		double bedroom1SquareFeet = bedroom1.calculateArea();
		
		//print a message "Bedroom 1 is (##.##) square feet"
		
		System.out.printf("Bedroom 1 is %.2f square feet.%n", bedroom1SquareFeet);
		
		// ------------------------------------- Bedroom 2 ----------------------------------------------
		//create a Rectangle object named bedroom2 by calling the 1-arg constructor and passing 12 
		
		Rectangle bedroom2 = new Rectangle(12);
		
		//set the width of bedroom2 to 12
		
		bedroom2.setWidth(12);
		
		//calculate the area of bedroom2 and save it in a variable named bedroom2SquareFeet
		
		double bedroom2SquareFeet = bedroom2.calculateArea();
		
		//print a message "Bedroom 2 is (##.##) square feet"
		
		System.out.printf("Bedroom 2 is %.2f square feet.%n", bedroom2SquareFeet);
		
		// ------------------------------------- Kitchen ----------------------------------------------
		//create a Rectangle object named kitchen by calling the no-arg constructor
		
		Rectangle kitchen = new Rectangle();
		
		//set the length of the kitchen to 15 and the width to 20
		
		kitchen.set(15, 20);
		
		//calculate the area of kitchen and save it in a variable named kitchenSquareFeet
		
		double kitchenSquareFeet = kitchen.calculateArea();
		
		//print a message "Kitchen is (##.##) square feet"
		
		System.out.printf("Kitchen is %.2f square feet.%n", kitchenSquareFeet);

		// ------------------------------------- LivingRoom ----------------------------------------------
		//create a Rectangle object named livingRoom by calling the no-arg constructor
		
		Rectangle livingRoom = new Rectangle();
		
		//set the length of the livingRoom to 20 and the width to 20
		
		livingRoom.set(20, 20);
		
		//calculate the area of livingRoom and save it in a variable named livingRoomSquareFeet
		
		double livingRoomSquareFeet = livingRoom.calculateArea();
		
		//print a message "Living Room is (##.##) square feet"

		System.out.printf("Living Room is %.2f square feet. %n", livingRoomSquareFeet);
		
	    //now determine the AC cooling capacity (number of BTUs) required to cool this small apartment,
		//     given the rule of thumb that it takes 20 BTUs to cool 1 square foot of living space
		
		double airconditioningamount = ((20 * bedroom1SquareFeet) + (20 * bedroom2SquareFeet) + (20 * kitchenSquareFeet) + (20 * livingRoomSquareFeet));
		
		//print a message to the screen "You will need to buy an air conditioner with a minimum cooling capacity of ### BTUs."
		
		System.out.printf("You will need to buy an air conditioner with a minimum cooling capacity of %.0f BTUs.", airconditioningamount);
	}
}