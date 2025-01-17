package Java;

public class Methodoverloading {

	   
	    public void display() {
	        System.out.println("No parameters");
	    }

	 
	    public void display(int num) {
	        System.out.println("Integer parameter: " + num);
	    }

	    
	    public void display(String message, double value) {
	        System.out.println(message + ": " + value);
	    }
	
	public static void main(String[] args) {
		Methodoverloading M = new Methodoverloading();

        M.display();                   
        M.display(20);                   
        M.display("Value", 20.5); 
		M.display(78);     
    }
}