package com.CorePrograms;
import java.util.Scanner;

public class SwapNumber {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
	        //Take input from the user
	        //Create an instance of the Scanner Class
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the first number");
	        int num1=sc.nextInt();
	        System.out.println("Enter the second number");
	        int num2=sc.nextInt();
	        System.out.println("Before Swapping numbers are: ");
	        System.out.println("First Number is "+num1);
	        System.out.println("Second Number is "+num2);
	        num1=num1-num2;
	        num2=num1+num2;
	        num1=num2-num1;
	        System.out.println("After Swapping numbers are: ");
	        System.out.println("First Number is "+num1);
	        System.out.println("Second Number is "+num2);

	}

}
