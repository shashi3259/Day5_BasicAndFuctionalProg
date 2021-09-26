package com.bridgelab.BasicCoreProgram;

public class UC3_PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		System.out.print("Enter the number till you want power of 2: ");
		int num = utility.getIntValue();
		utility.powerOfTwo(num);

	}

}
