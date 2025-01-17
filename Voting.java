package Java;

public class Voting {
	    String name;
	    int age;

	    // Parameterized constructor
	    public Voting(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to check if the person is eligible to vote
	    public void checkEligibility() {
	        if (age >= 18) {
	            System.out.println(name + " is eligible to vote.");
	        } else {
	            System.out.println(name + " is not eligible to vote.");
	        }
	    }
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	        Voting voter1 = new Voting("Priya", 25);
	        Voting voter2 = new Voting("Srinu", 17);
	        voter1.displayDetails();
	        voter1.checkEligibility();
	        voter2.displayDetails();
	        voter2.checkEligibility();
	    }
	}


