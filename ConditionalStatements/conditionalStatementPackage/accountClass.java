package conditionalStatementPackage;

public class accountClass {
	
	double balanceAmount;
	int withdrawlAmount;
	int overdraftAmount;
	int pinNumber;
	int enteredPIN;

	// withdrawl amount has a data type int cause we cannot withdraw cents from ATM machine,
	// however, we can get cents when withdrawing from bank. Therefore int
	
	
	/* customer can withdraw cash if the following conditions are true
	 * if balanceAmount >= withdrawlAmount
	 * OR || (|| --> this is an OR, the symbol || is called pipeline )
	 * if overdratAmount >= withdrawlAmount
	 * if any of these two are true, customer can withdraw cash
	 */
	
	/* 
	 *  Method to be used with no Overdraft Limit 
	 *  just to validate 1 statement
	 * 
	
	void atmWithdrawl ()
	{
		if(balanceAmount >= withdrawlAmount) {
			System.out.println("Customer can withdraw the money");
		}
		
		else {
			System.out.println("There is no sufficient balance to withdraw the entered amount");
		}
		
		
	}
	
	********* To validate 2 statements - ****************
	
	void atmWithdrawl ()
	{
		if(balanceAmount >= withdrawlAmount || overdraftAmount >= withdrawlAmount) {
			System.out.println("Customer can withdraw the money");
		}
		
		else {
			System.out.println("There is no sufficient balance to withdraw the entered amount");
		}
		
		
	}     
	    */
	  
	   
	
	
	/* ****** to validate 2 or more statements ************ 
	
	
	
	
	void validatingPINandWithdrawCash()
	{
		/* one way of writing the code to validate Pin number is the following
		if (enteredPIN == pinNumber & balanceAmount >= withdrawlAmount) {
			
		}
		
		else {
			
		}
		 this has one drawback, we are checking 2 statements inside if
		 but we also need to check if the withdrawlamount<= overdraftAmount
		 this will make it a 3rd statement
		 so if becomes 
		 if ( (enteredPIN == pinNumber & balanceAmount >= withdrawlAmount) & (overdraftAmount >= withdrawlAmount  )
		 {
		 	This makes the if statement too big
		 	 		
		 	 }
		 	 
		 	 therefore try another method
		 	 if inside an if
		 	 nested loop -
		 	 
		 
		
		*/
		
	
	   void validatingPinAndCashWithdrawl ()
	   {
		   if (enteredPIN == pinNumber){
		           System.out.println("Correct Pin Number");
			   
			   if (balanceAmount >= withdrawlAmount || overdraftAmount >= withdrawlAmount) {
				   System.out.println("customer can withdraw Money.");
				   
			   }
			   else {
				   System.out.println("Not sufficent balance to withdraw Cash.");
				   
			   }
		   }
		   else {
			   System.out.println("Wrong Pin Number");
			   
		   }
	   }
	
	
	
	}
	
	
	
	
	
	
	
	  
	
	


