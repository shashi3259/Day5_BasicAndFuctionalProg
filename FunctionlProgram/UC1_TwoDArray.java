package com.bridgelab.FunctionlProgram;

public class UC1_TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalProgramUtility utility = new FunctionalProgramUtility();
		System.out.println("Enter the rows: ");
		int rows = utility.getIntValue();
		System.out.println("Enter the columns: ");
		int columns= utility.getIntValue();
		utility.twoDArray(rows, columns);
		
		

	}

}
