package day13;
import java.util.Scanner;

public class StudentAverage {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        int[] marks = new int[numSubjects];

	        System.out.println("Enter marks for each subject:");
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }

	        // Create an inner class to calculate average
	        class AverageCalculator {
	            public double calculateAverage(int[] marks) {
	                int sum = 0;
	                for (int mark : marks) {
	                    sum += mark;
	                }
	                return (double) sum / marks.length;
	            }
	        }

	        // Create an instance of the inner class
	        AverageCalculator averageCalculator = new AverageCalculator();

	        // Calculate and print the average
	        double average = averageCalculator.calculateAverage(marks);
	        System.out.println("Average marks: " + average);

	        scanner.close();
	    }
	}
