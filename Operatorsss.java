package Java;

public class Operatorsss {
	    public static void main(String[] args) {
	        // Declaring variables
	        int a = 10, b = 5;
	        boolean x = true, y = false;

	        // Arithmetic Operators
	        int sum = a + b;          
	        int diff = a - b;          

	        // Relational Operators
	 	    boolean isGreaterThan = a > b; 
	        boolean isLessThan = a < b; 
	        
	        // Logical Operators
	        boolean andResult = x && y; 
	        boolean orResult = x || y; 

	        // Assignment Operator
	        a += 5; 
	        b *= 2; 

	        // Unary Operators
	        int unaryIncrement = ++a;  
	        int unaryDecrement = --b;  

	        // Displaying the results
	        System.out.println("Arithmetic Operators:");
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + diff);
	       
	        System.out.println("\nRelational Operators:");
	       
	        System.out.println("a > b: " + isGreaterThan);
	        System.out.println("a < b: " + isLessThan);
	       

	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y: " + andResult);
	        System.out.println("x || y: " + orResult);
	    

	        System.out.println("\nAssignment Operators:");
	        System.out.println("a after a += 5: " + a);
	        System.out.println("b after b *= 2: " + b);

	        System.out.println("\nUnary Operators:");
	        System.out.println("Pre-increment a: " + unaryIncrement);
	        System.out.println("Pre-decrement b: " + unaryDecrement);
	    }

}
