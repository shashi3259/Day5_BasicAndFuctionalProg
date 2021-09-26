package com.bridgelab.FunctionlProgram;

import java.util.Scanner;

public class FunctionalProgramUtility {
	Scanner sc;
	public FunctionalProgramUtility() {
		sc = new Scanner(System.in);
	}
	public int getIntValue() {
		return sc.nextInt();
	}
	
	// Two D Array
	public Integer[][] twoDArray(int m, int n) {
		Integer [][]array = new Integer[m][n];
		System.out.println("Enter the"+ m*n +"integer value");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				array [i][j]= getIntValue();
			}
		}
		System.out.println("Two D array is: ");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(array [i][j] + " ");
			}
			System.out.println();
		}
		return array;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
