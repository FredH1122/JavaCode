package Oct21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bankAccount = new Bank("Farid", "Checking", "123456", 1000.0);

        bankAccount.printStatement();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bank Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + bankAccount.getBalance());
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println("Exiting Bank. Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        }
    }
}







