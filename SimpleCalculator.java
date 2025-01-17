package Java;

public class SimpleCalculator {
	
	    public void add(int a, int b) {
	        int result = a + b;
	        System.out.println("Addition: " + result);
	    }
	    public void subtract(int a, int b) {
	        int result = a - b;
	        System.out.println("Subtraction: " + result);
	    }
	    public void multiply(int a, int b) {
	        int result = a * b;
	        System.out.println("Multiplication: " + result);
	    }

	    public static void main(String[] args) {
	        SimpleCalculator calculator = new SimpleCalculator();
	        calculator.add(5, 3);     
	        calculator.subtract(10, 4);  
	        calculator.multiply(7, 6);     
	    }
	}