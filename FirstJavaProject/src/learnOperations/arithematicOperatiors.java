package learnOperations;

public class arithematicOperatiors {
	
	/* Arithematic operations are basically symbols that tell a computer or mathematical
	 * system to perform basic math operations- =, -, *(multiply),
	 *  /(divide)[5/2 = 2.5],
	 * %(Remainder) [5/2 = 1 (remainder is the answer)] 
	 * ** or ^ (Exponentiation (power)) - 5**2 = 25 (5 times 5 = 25)*/
	
	int num1;
	int num2;
	
	void addition()
	{
		int sum = num1 + num2;
		System.out.println("The addition of " + num1 + " and " + num2 + " is "+ sum);
		
		//System.out.println("The addition of the number = " + sum);
		
		// System.out.println("The addition = " + (num1+num2));
	}
	
	void subtract()
	{
		int difference = num1-num2;
		System.out.println("The subtraction of " + num1 + " and " + num2 + " is "+ difference);
	}
	
	
	void multiply()
	{
		int product= num1*num2;
		System.out.println("The product of " + num1 + " and " + num2 + " is "+ product);
	}
	
	
	void divide()
	{
		double quotient = num1/num2;
		int remainder = num1%num2;
		System.out.println("The quotient of " + num1 + " and " + num2 + " is "+ quotient);
		System.out.println("The remainder of " + num1 + " and " + num2 + " is "+ remainder);
	}
	

}
