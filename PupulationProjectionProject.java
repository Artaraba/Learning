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
        System.out.print("Please enter a birth rate (births per sec, whole number format only): ");
        int birthRate = input.nextInt();
        System.out.println();
        // Get death rate from user
        System.out.print("Please enter a death rate (deaths per sec whole numbers only): ");
        int deathRate = input.nextInt();
        System.out.println();
        // Get immigration rate from user
        System.out.print("Please enter an immigration rate (immigrations per sec, whole numbers only): ");
        int immigrationRate = input.nextInt();
        System.out.println();
        // Get current population
        System.out.print("Please enter the current population (whole humbers only): ");
        int currentPopulation = input.nextInt();
        System.out.println();
        // Find population growth rate
        double growthRate = ((birthRate + immigrationRate) - (deathRate)) / 100.00;
        // Calculate population projection for each year in the next five years
        double yearOnePop = currentPopulation * Math.pow((1 + growthRate), 1);
        double yearTwoPop = currentPopulation * Math.pow((1 + growthRate), 2);
        double yearThreePop = currentPopulation * Math.pow((1 + growthRate), 3);
        double yearFourPop = currentPopulation * Math.pow((1 + growthRate), 4);
        double yearFivePop = currentPopulation * Math.pow((1 + growthRate), 5);
        System.out.println("Year one pop: " + yearOnePop);
        System.out.println("Year two pop: " + yearTwoPop);
        System.out.println("Year three pop: " + yearThreePop);
        System.out.println("Year four pop: " + yearFourPop);
        System.out.println("Year five pop: " + yearFivePop);
    }
}
