/* Konnie Detoudom
 * CS180 - SN1
 * Assignment 1B
 */

public class CodeBreaker {

	public static void main(String[] args) {
		String message = "Zyngrats! Xyu Wryke The Zyde!";
		
		System.out.println("The encoded message is: " + message);
		
		message = message.replace('Z', 'C');
		message = message.replace('y', 'o');
		message = message.replace('X', 'Y');
		message = message.replace('W', 'B');
		
		System.out.println("The decoded message is: " + message);
		
		String message1 = message.substring(0,9);
		String message2 = message.substring(9);
		message1 = message1.toUpperCase();
		
		System.out.println("Message 1 is: " + message1);
		System.out.println("Message 2 is: " + message2);
	}

}
