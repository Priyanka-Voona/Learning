package Java;

public class Intrest {
	public static void main(String[] args) {
        // Declare variables
        double principal = 17000; // Principal amount in Rupees
        double interestRate = 0.07; // Interest rate

        // Calculate interest and total investment value
        double interest = principal * interestRate/100;
        double totalValue = principal + interest;

        // Output the results
        System.out.println("Principal Amount: Rs " + principal);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Interest Earned: Rs " + interest);
        System.out.println("Total Investment Value After 1 Year: Rs " + totalValue);
    }
}