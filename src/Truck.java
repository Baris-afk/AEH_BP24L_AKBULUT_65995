public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price,
                 double fuelConsumption, double fuelLevel, double mileage, double loadCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck: " + registrationNumber + ", Capacity: " + loadCapacity + " tons");
    }
}
