package com.CorePrograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n; //  Declaration
		System.out.println("Enter the Power : ");
		n = sc.nextInt(); // Year Initialization
		
       
        int i = 0;                // count from 0 to N
        int power = 1;       // the ith power of two


        // repeat until i equals n
        while (i <= n) {
        	System.out.println("Power" + " " +"Result" ); 
            System.out.println("  " +i + "      " + power);   // print out the power of two
            power = 2 * power;                // double to get the next one
            i = i + 1;
        }
		

  }

}
