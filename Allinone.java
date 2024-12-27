package day13;
//Write a program to create two static variables num1 and num2 and print 
//its addition, substraction, multiplication and division by using static block.

public class Allinone {
	    static int num1;
	    static int num2;

	    static {
	        num1 = 10;
	        num2 = 5;
	        
	    }

	    public static void main(String[] args) {
	        System.out.println("Addition: " +( num1 + num2));
	        System.out.println("Subtraction: " + (num1 - num2));
	        System.out.println("Multiplication: " + (num1 * num2));
	        System.out.println("Division: " + (num1 / num2));
	    }
	}
	

	
