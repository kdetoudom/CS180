/* Breakout Group 3 - Melissa Pichardo, Konnie Detoudom, Pat Geitner, Ryan Philibottle, Jack Fitzgerald
 * CS180 - SN1
 * Group Assignment 4
 */

import java.util.Scanner;
public class GroupAssignment4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first test grade: ");
		int Test1 = keyboard.nextInt();
		
		System.out.println("Enter the second test grade: ");
		int Test2 = keyboard.nextInt();
		
		System.out.println("Enter the third test grade: ");
		int Test3 = keyboard.nextInt();
		
		double Average = (Test1 + Test2 + Test3);
		Average = Average / 3;
		
		
		System.out.println("Test 1 = " + Test1 + "%");
		System.out.println("Test 2 = " + Test2 + "%");
		System.out.println("Test 3 = " + Test3 + "%");
		System.out.printf("The average of the three test grades is: %.2f%%", Average);
	}

}
