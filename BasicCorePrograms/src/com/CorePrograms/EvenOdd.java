package com.CorePrograms;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //To take input from the user 
	    //Create an object of scanner class
	    Scanner input = new Scanner(System.in);
	    int num;  //Declare a variable
	    System.out.println("Enter a number:");
	    num = input.nextInt();

	    //If number is divisible by 2 then it's an even number
	    //else odd number
	    if ( num % 2 == 0 )
	        System.out.println("The entered number is even");
	     else
	        System.out.println("The entered number is odd");

	}

}
