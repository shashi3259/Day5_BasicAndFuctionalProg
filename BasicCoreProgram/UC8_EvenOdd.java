package com.bridgelab.BasicCoreProgram;

public class UC8_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		System.out.println("Enter the number to check whether number is Odd or Even");
		int number = utility.getIntValue();
		utility.evenAndOdd(number);
		

	}

}
