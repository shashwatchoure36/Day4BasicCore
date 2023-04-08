package com.CorePrograms;
import java.util.Scanner;

public class QuientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
	      reminderQuotient();

	}

	private static void reminderQuotient() {
		// TODO Auto-generated method stub
		
	      float numerator, denominator;
	      int quotient, remainder;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Dividend: ");
	      numerator = s.nextFloat();
	      System.out.print("Enter the Divisor: ");
	      denominator = s.nextFloat();
	      
	      quotient = (int) (numerator/denominator);
	      remainder = (int) (numerator%denominator);
	      
	      System.out.println("\nQuotient = " +quotient);
	      System.out.println("Remainder = " +remainder);
		
	}

}
