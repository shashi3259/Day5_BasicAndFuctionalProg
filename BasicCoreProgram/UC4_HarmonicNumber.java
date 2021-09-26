package com.bridgelab.BasicCoreProgram;

public class UC4_HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		System.out.print("Enter the Nth value for Harmonic Series");
		int num = utility.getIntValue();
		utility.harmonicNumber(num);

	}

}
