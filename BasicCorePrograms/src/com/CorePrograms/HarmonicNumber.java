package com.CorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // command-line argument
        harmonicNumber();
        

	}

	private static void harmonicNumber() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n; //  Declaration
		System.out.println("Enter the Number : ");
		n = sc.nextInt(); // Year Initialization
        

        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
		
	}

}
