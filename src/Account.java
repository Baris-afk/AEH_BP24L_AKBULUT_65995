public class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Account(String accountNumber, String ownerName, String email, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of PLN " + amount + " was made. New balance = PLN " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account. Remaining balance = PLN " + balance);
        } else {
            System.out.println("Insufficient funds. You have PLN " + balance + " in your account.");
        }
    }
}
