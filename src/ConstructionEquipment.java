public class ConstructionEquipment extends Vehicle {
    private int hoursWorked;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price,
                                 double fuelConsumption, double fuelLevel, double mileage, int hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Construction Equipment: " + registrationNumber + ", Hours: " + hoursWorked);
    }
}
