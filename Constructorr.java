package Java;

public class Constructorr {
	    String brand;
	    int year;

	    // Default constructor
	    public Constructorr() {
	        brand = "VOLVO";
	        year = 2020;
	    }

	    // Method to display values
	    void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Year: " + year);
	    }
	
	    public static void main(String[] args) {
	        // Creating an object using the default constructor
	    	Constructorr myCar = new Constructorr();
	        myCar.display();
	    }
	}


