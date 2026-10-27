package learnOperations;

public class operatorsMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithematicOperatiors ao = new arithematicOperatiors();
		// ao.addition();
		/* if we run line 9 only and haven't assigned any value to the variable
		 * the result will be - The addition of 0 and 0 is 0
		 * because we ran the code without assigning any value to the variables
		 * therefore, java assigned a value to it by itseld
		 * it is called default value
		 * the default value for int, long, short, byte - 0
		 * for double and float - 0.0
		 * for boolean - false
		 * for string - null
		 * basically 0 binary number - 0.
		 */
		
		// Assigning the values to the variables
		ao.num1 = 20;
		ao.num2 = -45;
		// invoking the method
		ao.addition();
		
		
		
		//Re-assigning the value
		ao.num1 = 15;
		ao.num2 = 10;
		// invoking the method
		ao.addition();
		
		/* Java reads and run code line by line.
		 * from line 11 to 14 - integers values are 20 and 45
		 * therefore the addition method will print out the sum of these two numbers
		 * which is 20+45 = 65 */
		
		/* When we re-assigned the vales - line 19 and 20 and run the code
		 * it will print  - the addition of 20 and 45 is 65.
		 * it happens cause we reassigned the value but haven't invoked/called the method yet */
		
		/* when we run the code from line 11 to  22
		 * the resuls are - The addition of 20 and 45 is 65
                            The addition of 15 and 10 is 25
            because we invoked the method and java reads and run the code line by line so it printed 
            both results*/
		/* if we commented out line 14 and run the program
		 * the result will be -  The addition of 15 and 10 is 25
		 * because java found the addition method after we reassigned the vale and therefore performed the 
		 * addition of the reassigned value*/
		
		
		/*  *********************************************************************************************  */
		
		ao.subtract();
		/* if i want to reassign the value again, i'll simply assign the value by writing
		 * ao.num1 = 15;
		 * ao.num2 = -10 (int can be negative as well)
		 * OR
		 * if i wish to choose another variable and leave num1 and num 2 for addition method only,
		 * i go to the arithematicOperations class and declare two new variables with the int data type
		 * e.g - int num3; int num4; and come back here and create a new object like
		 * arithematicOperatiors ao = new arithematicOperatiors();
		 * ao.num3 = 50;
		 * ao.num4 = -60;
		 * ao.subtract();
		 * the result will be - The subtraction of 50 and -60  is -10
		 * */
		
		ao.multiply();
		ao.divide();
		/* 
		 * Let's say we create a new object 
		 * arithematicOperatiors ao1 = new arithematicOperatiors();
		 * and invoke the divide method without assigning any values to the variables
		 * what will happen ?
		 * java will give the variables a default value of (0) by itself cause as per the
		 * data type their default value is o or o.o
		 * what will be the result then ?
		 * it will be a run time error cause we cannot divide any number with 0 and java 
		 * knows that too. (She's smart :< ) )
		 *                              
		 * */
		

	}

}
