package conditionalStatementPackage;

import java.util.Scanner;

public class atmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountClass arpan = new accountClass ();
		/*
		arpan.balanceAmount = 1000.01;
		arpan.withdrawlAmount = 1500;
		arpan.overdraftAmount = 5000;
		arpan.atmWithdrawl();
		*/
		
		/* Let's ask the cx to enter the withdrawl amount
		 * 
		 * */
		arpan.balanceAmount = 1000.01;
		arpan.overdraftAmount = 500;
		arpan.pinNumber = 1234;
		
		
		
		// for getting an input from user we use scanner
		// syntax for adding/initiating a scanner
		Scanner sc = new Scanner(System.in);
		
		// Asking cx to enter the PIN Number
		System.out.println("Please enter the PIN Number");
		
		// Storing the value entered of PIN Number entered by cx
		
		 arpan.enteredPIN = sc.nextInt();
		
		// we need to display a msg on screen so cx know they have to enter an amount
		System.out.println("Enter the Withdraw Amount");
		
		// now we are assigning the withdraw amount entered by cx to a variable 
		arpan.withdrawlAmount  = sc.nextInt();
		
		/* this sc.nextInt(); is basically a method that will assign the vale to a variable and we chose
		//   next integer because it will hold an integer value,
		  -  if we asked cx to enter a name ( which is a string )
		   we would have used next();
		   as we type sc. java will give us options to select what kind of data type we'll be selecting
		*/
		
	//	arpan.atmWithdrawl();
		arpan.validatingPinAndCashWithdrawl();
		
	}

}
 