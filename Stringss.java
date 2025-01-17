package Java;

public class Stringss {
	    public static void main(String[] args) {
	        String str = "HI HELLO PRIYAAA..!";
	        
	        int length = str.length();
	        System.out.println("Length of the string: " + length);
	        
	        char characterAtIndex = str.charAt(7);
	        System.out.println("Character at index 7: " + characterAtIndex);
	        
	        String upperCaseStr = str.toUpperCase();
	        System.out.println("Uppercase version: " + upperCaseStr);
	         
	        String lowerCaseStr = str.toLowerCase();
	        System.out.println("Lowercase version: " + lowerCaseStr);
	        
	        String subStr = str.substring(7, 12); 
	        System.out.println("Substring from index 7 to 12: " + subStr);
	            
	        int index = str.indexOf('O');
	        System.out.println("Index of first 'O': " + index);
	        
	        String replacedStr = str.replace("World", "Java");
	        System.out.println("After replacing 'World' with 'Java': " + replacedStr);
	        }
	}