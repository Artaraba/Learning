//*| Created by: Alex Taraba                                                                      |*\\
//*|                                                                                              |*\\
//*| Created on: 07/21/2024                                                                       |*\\
//*|                                                                                              |*\\
//*| Intent: This program is meant to take input from users concerning the following questions:   |*\\
//*|                1) What is the birthrate (births per sec)?                                    |*\\
//*|                 2) What is the death rate (deaths per sec)?                                  |*\\
//*|                3) What is the immigration rate (immigrations sec)?                           |*\\
//*|                                                                                              |*\\
//*| and produce a population growth rate projection (numbers only) number on the display screen. |*\\

// Import necessary java classes
import java.util.Scanner;

// Begin class PupulationProjectionProject
public class PupulationProjectionProject {
    // Begin main(String[] args) method
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);
        // Print header
        System.out.println();
        System.out.println("****************************************************************************************************");
        // Get birthrate from user
        System.out.print("Please enter a birthrate (births per sec, whole number format only): ");
        int birthRate = input.nextInt();
        System.out.println();
        // Get deathrate from user
        System.out.print("Please enter a deathrate (deaths per secm whole numbers only) : ");
        int deathRate = input.nextInt();
    }
}
