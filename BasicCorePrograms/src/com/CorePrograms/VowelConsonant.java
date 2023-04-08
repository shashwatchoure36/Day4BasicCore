package com.CorePrograms;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     char my_input;
	      System.out.println("Required packages have been imported");
	      Scanner my_scanner = new Scanner(System.in);
	      System.out.println("A reader object has been defined ");
	      System.out.print("Enter the character : ");
	      my_input = my_scanner.next().charAt(0);
	      if(my_input == 'a' || my_input == 'e' || my_input == 'i' || my_input == 'o' || my_input == 'u' )
	         System.out.println("The character : " +my_input + " is a vowel");
	      else
	         System.out.println("The character : " +my_input + " is a consonan");

	}

}
