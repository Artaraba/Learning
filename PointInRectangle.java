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
        // Print information to user
        System.out.println("A rectangle is centered at 0,0 and is 10\" wide by 5\"");
        // Create scanner object to capture user input
        Scanner input = new Scanner(System.in);
        // Get user input
        System.out.print("Please enter a coordinate in the form of (x y) to verify it is inside the Rectangle: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check if point in quadrant 1
        if (x <= 10.0 / 2 && x >= 0) {
            if (y <= 5.0 / 2 && y >= 0) {
                System.out.print("Point is inside the rectangle (quadrant 1)");
            }
        }

        // Check if point in quadrant 4
        if (x <= 10.0 / 2 && x >= 0) {
            if (y >= 5.0 / -2 && y <= 0) {
                System.out.print("Point is inside the rectangle (quadrant 4)");
            }
        }

        // Check if point in quadrant 2
        if (x >= 10.0 / -2 && x <= 0) {
            if (y <= 5.0 / 2 && y >= 0) {
                System.out.print("Point is inside the rectangle (quadrant 2)");
            }
        }

        // Check if point in quadrant 3
        if (x >= 10.0 / -2 && x <= 0) {
            if (y >= 5.0 / -2 && y <= 0) {
                System.out.print("Point is inside the rectangle (quadrant 3)");
            }
        }

        if (x > 5 || x < -5) {
            System.out.print("The point (" + x + ", " + y + ") is not in the rectangle");
        }
    } // End main(String[] args) method
} // End class PointInRectangle
