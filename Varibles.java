package Java;

public class Varibles {
	

	    // Instance Variable
	    int instanceVar = 10;

	    // Class Variable (Static)
	    static int classVar = 20;

	    public void showInstanceVar() {
	        System.out.println("Instance Variable: " + instanceVar);
	    }

	    public static void showClassVar() {
	        System.out.println("Class Variable: " + classVar);
	    }

	    public static void main(String[] args) {

	        // Local Variable
	        int localVar = 30;
	        System.out.println("Local Variable: " + localVar);
	      
	        Varibles obj = new Varibles();
	        obj.showInstanceVar();
	        
	        
	        showClassVar();  
	    }
	}

