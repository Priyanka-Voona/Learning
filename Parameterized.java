package Java;

public class Parameterized {
	
	    public int add(int a, int b) {
	        return a + b;  
	    }

	    public static void main(String[] args) {
	    	Parameterized obj = new Parameterized();
	        
	        // Calling the parameterized method with arguments
	        int result = obj.add(5, 10);  // Passing 5 and 10 as arguments
	        
	        // Printing the result
	        System.out.println("The sum is: " + result);
	    }
	}

