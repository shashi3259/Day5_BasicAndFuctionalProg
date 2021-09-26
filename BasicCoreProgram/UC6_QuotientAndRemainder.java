package com.bridgelab.BasicCoreProgram;

public class UC6_QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		
		System.out.println("Enter Dividend: ");
		int dividend = utility.getIntValue();
		System.out.println("Enter Divisor: ");
		int divisor = utility.getIntValue();
		utility.quotientAndRemainder(dividend, divisor);

	}

}
