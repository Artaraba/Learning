/* A Taraba Tech software
* 
* Created by: Alex Taraba
* Date of origin: 07/26/2024
* Version: 0
* This program is meant to get a point from the user then determine if it falls
* inside the rectangle which is centered at 0,0
*
*/

// Import necessary classes
import java.util.Scanner;

// Begin class PointInRectangle
public class PointInRectangle {
    // Begin main(String[] args) method
    public static void main(String[] args) {
        // Create scanner object to capture user input
        Scanner input = new Scanner(System.in);
        // Get user input
        System.out.print("Please enter a coordinate in the form of (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
    } // End main(String[] args) method
} // End class PointInRectangle
