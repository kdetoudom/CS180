import java.util.Scanner; 

public class AmazonDelivery {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Welcome to Amazon's Truck Packing Program");
		System.out.println("We have 3 types of trucls used for package delivery: PickupTruck (6x6x6), BoxTruck (12x6x6), TrailerTruck(18x6x6)");
	
		Cube PickupTruck = new Cube(6.0,6.0,6.0);
		Cube BoxTruck = new Cube(12.0,6.0,6.0);
		Cube TrailerTruck = new Cube(18.0,6.0,6.0);

		System.out.println("Here is a list of trucks ready to deliver: ");
		System.out.println("PickupTruck " + PickupTruck.toString() + " BoxTruck " + BoxTruck.toString() + " TrailerTruck " + TrailerTruck.toString());
		System.out.println("We have 3 types of boxes that are delivered in these trucks: smallBox 1x1x1, mediumBox 1x1x2, largeBox 1x1x3");
		
		Cube smallBox = new Cube(1.0,1.0,1.0);
		Cube mediumBox = new Cube(1.0,1.0,2.0);
		Cube largeBox = new Cube(1.0,1.0,3.0);
		
		double smallboxVolume = smallBox.calculateVolume();
		double mediumboxVolume = mediumBox.calculateVolume();
		double largeboxVolume = largeBox.calculateVolume();
		
		System.out.println("Enter the number of small boxes for this delivery (1-100): ");
		double smallboxNumber = keyboard.nextDouble();
		
		System.out.println("Enter the number of medium boxes for this delivery (1-100): ");
		double mediumboxNumber = keyboard.nextDouble();
		
		System.out.println("Enter the number of large boxes for this delivery (1-100): ");
		double largeboxNumber = keyboard.nextDouble();
		
		double PickupTruckVolume = PickupTruck.calculateVolume();
		double BoxTruckVolume = BoxTruck.calculateVolume();
		double TrailerTruckVolume = TrailerTruck.calculateVolume();
		
		double totalBoxVolume = ((smallboxNumber * smallboxVolume) + (mediumboxNumber * mediumboxVolume) + (largeboxNumber * largeboxVolume));
		String deliverytruckDecision = null;
		
		if (totalBoxVolume <= PickupTruckVolume)
		{
			deliverytruckDecision = "PickupTruck";
		}
		else if (totalBoxVolume <= BoxTruckVolume)
		{
			deliverytruckDecision = "BoxTruck";
		}
		else if (totalBoxVolume <= TrailerTruckVolume)
		{
			deliverytruckDecision = "TrailerTruck";
		}
		
		System.out.println("The " + deliverytruckDecision + " is the smallest truck that can be used for this delivery! (The total box volume was " + totalBoxVolume + ").");
		
		
}}