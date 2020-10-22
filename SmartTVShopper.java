/* Konnie Detoudom
 * CS180 - SN1
 * Assignment 2A
 */

import java.util.Scanner;
public class SmartTVShopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Enter the make/model of the first 40\" TV along with the price: ");
		String TV1 = keyboard.next();
		double TV1Price = keyboard.nextDouble();
		
		System.out.println("Enter the make/model of the second 40\" TV along with the price: ");
		String TV2 = keyboard.next();
		double TV2Price = keyboard.nextDouble();
		
		System.out.println("Enter the make/model of the third 40\" TV along with the price: ");
		String TV3 = keyboard.next();
		double TV3Price = keyboard.nextDouble();
		
		double Coupon1 = .1;
		double Coupon2 = .15;
		double Coupon3 = .2;
		double Tax = .0635;
		
		TV1Price = (TV1Price - (TV1Price * Coupon1));
		TV2Price = (TV2Price - (TV2Price * Coupon2));
		TV3Price = (TV3Price - (TV3Price * Coupon3));
		
		TV1Price = TV1Price + (TV1Price * Tax);
		TV2Price = TV2Price + (TV2Price * Tax);
		TV3Price = TV3Price + (TV3Price * Tax);
		
		System.out.printf("The price of %s with a 10%% coupon applied is: $%.2f%n", TV1, TV1Price);
		System.out.printf("The price of %s with a 15%% coupon applied is: $%.2f%n", TV2, TV2Price);
		System.out.printf("The price of %s with a 20%% coupon applied is: $%.2f%n", TV3, TV3Price);
		System.out.println("Good luck in choosing a TV!!");
	}

}
