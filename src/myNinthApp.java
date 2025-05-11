public class myNinthApp {
    public static void main(String[] args) {
        // Create a warehouse object with 5000 units space
        Warehouse myWarehouse = new Warehouse(1, 5000, "John Doe", "john@example.com", "+48 111 222 333");

        // Add 3000 units
        myWarehouse.addGoods(3000);

        // Remove 1000 units
        myWarehouse.removeGoods(1000);

        // Add 2500 units
        myWarehouse.addGoods(2500);

        // Check how much is occupied
        myWarehouse.checkOccupancy();

        // Update contact information
        myWarehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");

        // Try to add more than space left
        myWarehouse.addGoods(1000);
    }
}
