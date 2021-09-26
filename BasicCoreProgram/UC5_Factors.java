package com.bridgelab.BasicCoreProgram;

public class UC5_Factors {
	public static void main(String[] args) {
		BasicProgramUtility utility = new BasicProgramUtility();
		System.out.print("Enter the number: ");
		int num = utility.getIntValue();
		utility.factor(num);
	}

}
