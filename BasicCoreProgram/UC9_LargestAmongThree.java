package com.bridgelab.BasicCoreProgram;

public class UC9_LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		System.out.print("Enter 1st number: ");
		int num1 = utility.getIntValue();
		System.out.print("Enter 2nd number: ");
		int num2 = utility.getIntValue();
		System.out.print("Enter 3rd number: ");
		int num3 = utility.getIntValue();
		utility.largestAmongThree(num1, num2, num3);
		

	}

}
