package com.bridgelab.BasicCoreProgram;

public class UC1_FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		System.out.print("Enter the no. of times you want to Flip the coin: ");
		int flip = utility.getIntValue();
		utility.flipCoin(flip);
		

	}

}
