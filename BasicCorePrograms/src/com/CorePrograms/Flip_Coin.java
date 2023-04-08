package com.CorePrograms;
import java.util.Scanner;

public class Flip_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coinFlip, Head=0, Tail=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbrer of time flip the coin");
		coinFlip=sc.nextInt();
		
		for(int i=0; i<coinFlip; i++) {
			if(Math.random()<0.5) {
				Tail++;
			}
			else {
				Head++;
			}
		
		}
		System.out.println("Count of Tails: "+Tail);
		double cntTails=(Tail/(double)coinFlip)*100;
		double cntHead=(Head/(double)coinFlip)*100;
		System.out.println("Count of Head" + Head);
		System.out.println("Percentage of Tails" + cntTails);
		System.out.println("Percentage of Head" + Head);
		
		
		
		

	}

}
