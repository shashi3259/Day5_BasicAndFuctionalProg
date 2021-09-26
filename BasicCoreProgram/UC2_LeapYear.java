package com.bridgelab.BasicCoreProgram;

public class UC2_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramUtility utility = new BasicProgramUtility();
		char choice;
		do {
		System.out.print("Enter the year: ");
		int year = utility.getIntValue();
		utility.leapYear(year);
		System.out.println("Do want to check for different year? y/n");
		choice = utility.repeatProgram();
		}while(choice =='Y' || choice == 'y');
		
	}

}
