package lesson04_robustness;

public class ExceptionDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("SAVINGS-101", 100.00);

        // Scenario 1: Successful Transaction
        try {
            myAccount.withdraw(50.0);
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("---------------------------------");

        // Scenario 2: Failed Transaction (Shortfall)
        try {
            myAccount.withdraw(200.0);
        } catch (InsufficientFundsException e) {
            // Handling the specific error
            System.err.println("ALERT: " + e.getMessage());
            System.out.println("Action Required: Please deposit at least $" + e.getShortfall());
        } finally {
            // This runs regardless of success or failure
            System.out.println("Final Balance Check: $" + myAccount.getBalance());
            System.out.println("Transaction session closed.");
        }
    }
}