public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                      double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + registrationNumber + ", Sidecar: " + hasSidecar);
    }
}
