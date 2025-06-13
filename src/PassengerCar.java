public class PassengerCar extends Vehicle {
    private int numberOfDoors;

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price,
                        double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger Car: " + registrationNumber + ", Doors: " + numberOfDoors);
    }
}
