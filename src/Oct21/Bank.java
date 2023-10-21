package Oct21;

public class Bank {
    private String accountHolderName;
    private String accountType;
    private String accountNumber;
    private double accountBalance;
    public Bank(String accountHolderName, String accountType, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = initialBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
            System.out.println("New Balance: $" + accountBalance);
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
            System.out.println("New Balance: $" + accountBalance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

       public void printStatement() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + accountBalance);
    }

}
