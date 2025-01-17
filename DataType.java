package Java;

public class DataType {
	    public static void main(String[] args) {
	    	
	        byte b1 = 100;           
	        short s1 = 10000;      
	        int int1 = 50000;           
	        long l1= 100000L;       
	        float f1= 10.5f;      
	        double d1 = 123.456;   
	        char c1 = 'A';           
	        boolean b2 = true;       
	        String str1 = "Hello, Java!";  
	        int[] arr1 = {1, 2, 3, 4, 5};

	        System.out.println("byte: " + b1);
	        System.out.println("short: " + s1);
	        System.out.println("int: " + int1);
	        System.out.println("long: " + l1);
	        System.out.println("float: " + f1);
	        System.out.println("double: " + d1);
	        System.out.println("char: " + c1);
	        System.out.println("boolean: " + b2);
	        System.out.println("String: " + str1);
	        
	        // Displaying values of array
	        System.out.print("Array: ");
	        for (int i : arr1) {
	            System.out.print(i + " ");
	        }
	    }
	}


