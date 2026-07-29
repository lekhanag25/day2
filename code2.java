import java.util.Scanner;

class BankAccount {
    // Private data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter Account Number: ");
        account.setAccountNumber(sc.nextLine());

        System.out.print("Enter Account Holder Name: ");
        account.setAccountHolderName(sc.nextLine());

        System.out.print("Enter Initial Balance: ");
        account.setBalance(sc.nextDouble());

        System.out.print("Enter Deposit Amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        account.withdraw(sc.nextDouble());

        account.checkBalance();

        sc.close();
    }
}
