package day13;
import java.util.Scanner;

public class RectangleParameter {
	

	

	   
	    static class PerimeterCalculator {
	        public static int calculatePerimeter(int length, int width) {
	            return 2 * (length + width);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter length of rectangle: ");
	        int length = scanner.nextInt();

	        System.out.print("Enter width of rectangle: ");
	        int width = scanner.nextInt();

	        // Calculate perimeter using the static method
	        int perimeter = PerimeterCalculator.calculatePerimeter(length, width);

	        System.out.println("Perimeter of rectangle: " + perimeter);

	        scanner.close();
	    }
	}

