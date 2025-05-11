public class Warehouse {
    private int warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Warehouse(int warehouseNumber, int totalSpace, String ownerName, String email, String phoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0; // warehouse is empty at the beginning
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setWarehouseNumber(int number) {
        this.warehouseNumber = number;
    }

    public void setTotalSpace(int space) {
        this.totalSpace = space;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    // Add goods to warehouse
    public void addGoods(int amount) {
        if (occupiedSpace + amount > totalSpace) {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    // Remove goods from warehouse
    public void removeGoods(int amount) {
        if (amount > occupiedSpace) {
            System.out.println("Cannot remove more goods than are in the warehouse. Stored goods: " + occupiedSpace + " units.");
        } else {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    // Check how much space is used
    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
    }

    // Update contact info
    public void updateContact(String newEmail, String newPhoneNumber) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + email);
        System.out.println("New phone number: " + phoneNumber);
    }
}
