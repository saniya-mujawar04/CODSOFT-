import java.util.Scanner;

// Class to represent Bank Account
class BankAccount {
    private double balance;

    // constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // check balance
    public double getBalance() {
        return balance;
    }
}

// Main class for ATM Interface
public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Starting balance
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Welcome to the ATM!");

        boolean exit = false;

        while (!exit) {
            // Menu display
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }

        sc.close();
    }
}
