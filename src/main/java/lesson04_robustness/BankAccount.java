package lesson04_robustness;

public class BankAccount {
    private double balance;
    private final String accountId;

    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    /**
     * Withdraws money.
     * @throws InsufficientFundsException if balance is too low.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw: $" + amount);
        
        if (amount > balance) {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}