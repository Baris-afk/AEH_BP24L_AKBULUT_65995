public class RentalTest {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("AB123", "1HGCM82633A004352", "Red", 20000.0, 6.5, 40.0, 12000.0, 4);
        Truck truck = new Truck("TRK456", "2HGCM82633A004355", "Blue", 50000.0, 15.0, 100.0, 50000.0, 10);
        Motorcycle bike = new Motorcycle("MC789", "3HGCM82633A004358", "Black", 8000.0, 3.5, 15.0, 5000.0, true);
        ConstructionEquipment excavator = new ConstructionEquipment("EQ999", "4HGCM82633A004359", "Yellow", 100000.0, 20.0, 200.0, 3000.0, 150);

        FuelType diesel = new Diesel();
        FuelType gasoline = new Gasoline();
        FuelType electric = new Electric();

        car.displayInfo();
        car.drive(100);
        car.refuel(10);
        System.out.println("Fuel type: " + gasoline.getFuelType());

        truck.displayInfo();
        truck.drive(50);
        truck.refuel(20);
        System.out.println("Fuel type: " + diesel.getFuelType());

        bike.displayInfo();
        bike.drive(80);
        bike.refuel(5);
        System.out.println("Fuel type: " + gasoline.getFuelType());

        excavator.displayInfo();
        excavator.drive(20);
        excavator.refuel(30);
        System.out.println("Fuel type: " + diesel.getFuelType());
    }
}
