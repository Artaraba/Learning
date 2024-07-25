/* A Taraba Tech Sofware
 * 
 * This program is built to help calculate interest on a checking/savings account
 * Created by: Alex Taraba
 * Version 0, created on 07-25-2024
 * 
*/

// Import necessary classes
import java.util.Scanner;

// Begin class CompountValue
public class CompoundValue {
    // Begin main(String[] args) method
    public static void main(String[] args) {
        // Create constant value for interest rate
        final double monthlyInterestRate =  .00417;
        // Create scanner object to accept user input
        Scanner input = new Scanner(System.in);
        // Request user monthly savings amount
        System.out.print("Please enter the amount that you will be putting into the account each month: ");
        double monthlyAmount = input.nextDouble();
        input.close();
        System.out.println("\nCalculating interest accrued over six months...");
        // Determine each month interest and total
        double monthOne = monthlyAmount * (1 + monthlyInterestRate);
        double monthTwo = (monthlyAmount + monthOne) * (1 + monthlyInterestRate);
        double monthThree = (monthlyAmount + monthTwo) * (1 + monthlyInterestRate);
        double monthFour = (monthlyAmount + monthThree) * (1 + monthlyInterestRate);
        double monthFive = (monthlyAmount + monthFour) * (1 + monthlyInterestRate);
        double monthSix = (monthlyAmount + monthFive) * (1 + monthlyInterestRate);
        // Print to screen
        System.out.printf("Month One: %5.2f\nMonth Two: %5.2f\nMonth Three: %5.2f\nMonth Four: %5.2f\nMonth Five: %5.2f\nMonth Six: %5.2f", monthOne,
        monthTwo, monthThree, monthFour, monthFive, monthSix);
    } // End main(String[] args) method
} // End class CompoundValue