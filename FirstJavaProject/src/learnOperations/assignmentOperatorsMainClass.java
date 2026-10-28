package learnOperations;

public class assignmentOperatorsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assingmentOperators assOp = new assingmentOperators();
		assOp.ageAfter5Years();
		assOp.age5YearsAgo();
		/*
		 * the result is - The final age agter 5 years is 20
							5 years ago the age was = 15
			this result came in cause it performed the calculation first
			15+5 = 20
			and assign the value 20 to the age and when the second method was compiled,
			the age vale was 20 and then it performed the calculation - 20-5 = 15
			therefore these results came in.
			
			also, if we write 
		assOp.ageAfter5Years();
		assOp.age5YearsAgo();
		assOp.ageAfter5Years();
		assOp.age5YearsAgo();
		the results will be - The final age agter 5 years is 20
							  5 years ago the age was = 15
							  The final age agter 5 years is 20
							  5 years ago the age was = 15

          haha!!!!!
			
		 */
		
		assOp.ageAfter5Years();
		assOp.age5YearsAgo();
		
		
	}

}
