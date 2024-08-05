// Package name
package ChapterOne;

// Import necessary classes
import java.util.Scanner;

/** Begin class ThreeMessages. This class will print three messages to the screen and then ask the user if they would like to print the messages again.
 ** If the user chooses "no" the program will end, if they choose "yes" the messages will print again, asking user if they would like to print it again
 ** until they enter "no".
 */
public class ThreeMessages {

	// Begin main(String[] args) method
	public static void main(String[] args) {
	
		// Create and initialize boolean variable to hold user choice
		boolean again = false;
		
		// Create scanner object "input" to capture user data
		Scanner input = new Scanner(System.in);
		
		// Print introduction to program and ask user if they wish to print the messages
		System.out.println("Welcome to Three Messages! This program will print three messages to the screen. When asked, please enter \"yes\" or \"no\".");
		System.out.println();
		
		// Control structure, do loop to print messages and check if user wishes to print them again
		do {
			System.out.println("Welcome to Java.");
			System.out.println("Welcome to Computer Science.");
			System.out.println("Programming is fun");
			System.out.print("Do you wish to print the messages again? Enter \"yes\" or \"no\"");
			String doAgain = input.next();
			
			if (doAgain.charAt(0) == 'y') {
				again = true;
			} else if (doAgain.charAt(0) == 'n') {
				again = false;
			} else {
				System.out.println("Program exiting, you have entered an invalid choice");
				System.exit(0);
			}
			
			// Decision structure based on user input
			
		} while (again == true);
	} // End main(String[] args) method
} // End class ThreeMessages
