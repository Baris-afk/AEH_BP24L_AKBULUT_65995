public class myEighthApp {
    public static void main(String[] args) {
        // Creating a new account with initial balance of PLN 1000.0
        Account myAccount = new Account(
                "PL1234567890",
                "John Doe",
                "john.doe@example.com",
                "555-123-456",
                1000.0
        );

        // Performing operations
        myAccount.withdraw(900.0);   // Should succeed
        myAccount.deposit(250.0);    // Should succeed
        myAccount.withdraw(50.0);    // Should succeed
        myAccount.withdraw(500.0);   // Should fail (not enough funds)
    }
}
