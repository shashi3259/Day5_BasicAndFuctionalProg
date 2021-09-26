package com.bridgelab.BasicCoreProgram;
import java.util.Random;
import java.util.Scanner;

public class BasicProgramUtility {
	Scanner sc;
	public BasicProgramUtility() {
		sc = new Scanner(System.in);
	}
	public int getIntValue() {
		return sc.nextInt();
	}
	public char repeatProgram() {
		return sc.next().charAt(0);
	}

	// Flip coin
	public void flipCoin(int noOfTimes) {
		Random flip = new Random();
		double tail = 0;
		double head = 0;

		for(int i=0; i<noOfTimes; i++) {
			int value = flip.nextInt(2);
			if(value<0.5) {
				System.out.println("Tails");
				tail = tail +1;
			}
			else {
				System.out.println("Head");
				head = head + 1;
			}
		}
		System.out.println("No. of times Head occur = "+head);
		System.out.println("No. of times Tail occur = "+tail);
		double tailPercentage = (tail / noOfTimes)*100;
		System.out.println("Tail percentage is: "+ tailPercentage +"%");
		double headPercentage = (100-tailPercentage);
		System.out.println("Head percentage is: "+ headPercentage +"%");

	}

	// Leap year 
	public void leapYear(int year) {
		if((year%400==0) || ((year%4==0) && (year%100 != 0)) ) {
			System.out.println(year + " is a Leap year.");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}

	// Power of 2
	public void powerOfTwo(int N) {
		System.out.println("Power of two:");
		if(N <=31) {
			for(int i=0; i<=N; i++) {
				int value = (int) Math.pow(2, i);
				System.out.println("2^"+ i +" = "+value);
			}
		}
		else {
			System.out.println("Range is 0<=N<=31");
		}
	}

	// Harmonic Number
	public void harmonicNumber(int N) {
		double harmonicNumber = 0;
		for(int i=1; i<=N; i++) {
			harmonicNumber = harmonicNumber + (1.0/i);
		}
		System.out.println("Harmonic Value of "+ N +"th number is: "+ harmonicNumber);
	}

	// Factors of Two Number
	public void factor(int N) {
		int i =2;
		while(N>1) {
			if(N%i == 0) {
				System.out.print(i + ",");
				N = N/i;
			}
			else {
				i++;
			}
		}
	}
	
	// Quotient and Remainder
	public void quotientAndRemainder(int dividend, int divisor) {
		int quotient = dividend/divisor;
		int remainder = dividend - (quotient*divisor);
		
		System.out.println("Quotient is: "+ quotient);
		System.out.println("Remanider is: "+ remainder);
		
	}
	
	// Even and Odd
	public void evenAndOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	
	// Largest among three number
	public void largestAmongThree(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println(a + " is the Largest number among three number.");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is the Largest number among three number.");
		}
		else {
			System.out.println(c + " is the Largest number among three number.");
		}
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
