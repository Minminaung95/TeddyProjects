package teddyprojects;

import java.util.Scanner;

public class TeddyProjectOne {
	private static String name="Min Min";
	private static String pass="Mma@";
	private double balance =0.00;
	private double depositAmt;
	private double withdrawAmt;
	private static boolean checkNP;
	private int numIn;
	private boolean checkNum;
	
	static Scanner scan = new Scanner(System.in);
	
	private void checkInt() {
		do {
			System.out.println("Please type only 1,2,3,4 ");
			if(numIn == 1 || numIn == 2 || numIn == 3 || numIn == 4 ) {
				checkNum = false;
			}
			else {
				System.out.println("Please type only 1,2,3,4 ");
				checkNum = true;
			}
		}while(checkNum);
		successPage();
	}
	
	private  void viewBalance(){
		System.out.println("Your balance is $"+balance+"\n");
		successPage();
	}	
	
	private void withdrawFunds() {
	
		System.out.println("Enter your amount you want to withdraw: ");
		withdrawAmt = scan.nextDouble();
		if(withdrawAmt < balance) {
			balance = balance - withdrawAmt;
			System.out.println("Your new balance is $"+ balance+"\n");
			successPage();
		}
		else {
			System.out.println("Sorry.You have insufficient money to withdrawal.\n");
			successPage();
		}
	}
	
	private void depositFunds() {
		System.out.print("Enter your deposit amount: ");
		depositAmt = scan.nextDouble();
		System.out.println("Your deposit amount is $"+ depositAmt);
		balance = balance + depositAmt;
		System.out.println("Your balance is $"+balance+"\n");
		successPage();
	}
	
	private void exit() {
		System.out.println("*** Thank for using MMA bank ***");
//		System.out.println("** 2 decimal ဘယ်လိုယူရမလဲ ဆရာ Only 1,2,3,4 ရော မမှန်မချင်း ဘယ်လို looping ပတ်ရလဲ ဆရာ Please! **");
	}
	
	private  void successPage() {
		
		try {
			System.out.print("Choice your option- "
					+ "\n1. View Balance\n2. Withdraw Funds\n3. Deposit Funds\n4. Exit\n");
			numIn = scan.nextInt();
			switch(numIn) {
			case 1 : viewBalance();break;
			case 2 : withdrawFunds();break;
			case 3 : depositFunds(); break;
			case 4 : exit(); break;
			default: checkInt();
			
			}
		}catch(Exception e) {
			System.out.println(" Restart! Please type only 1,2,3,4 ");
			
		}
	}
	public static void main(String[] args) {
		
		TeddyProjectOne tpo = new TeddyProjectOne();
		System.out.println("------- WELCOME TO MMA BANK -------");
		do {
			System.out.print("Enter your name: ");
			String nameIn = scan.nextLine();
			System.out.print("ENter your password: ");
			String passIn=scan.nextLine();
			
			if(nameIn.equals(name) && passIn.equals(pass)) {
				tpo.successPage();
				checkNP = false;
			}
			else {
				System.out.println("Username or password is incorrect!!!");
				checkNP = true;
			}
		}
		while(checkNP);
		
	}

}
