package learnOperations;

public class assingmentOperators {
	/* assigntment operators are used to assign the values to the variables such as 
	 * =, +=,
	 */

	
	int age = 15;
	
	
	void ageAfter5Years()
	{
		/* int finalage = age +5;
		System.out.println("The final age after 5 years is " + finalage); 
		*/
		age += 5 ; // it reduced the coding by 2 lines cause this means - age = age+5
				   // first it will perform age +5 and then will reassig the value back to age
				   // It is also useful cause we don't have to create a new variable to hold the value of age
		           // after performing the calculation, cause it will reassign the value to the age after completing the calculations.
		System.out.println("The final age agter 5 years is " + age);
		
	}
	
	void age5YearsAgo()
	{
		age -= 5;
		System.out.println("5 years ago the age was = " +age);
	}
	
	
	
	
}
