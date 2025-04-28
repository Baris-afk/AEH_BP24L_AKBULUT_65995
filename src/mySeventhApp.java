package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person();  // Create object person1 with default constructor
        person1.hiToAll();  // Display default values

        // Set fields manually
        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.address = "123 Main Street";
        person1.yearOfBirth = 2000;
        person1.hiToAll();  // Display updated values

        // Create object with constructor
        Person person2 = new Person("Alice", "Hart", 42);
        person2.address = "456 Broadway";
        person2.yearOfBirth = 1982;
        person2.hiToAll();

        // Using growOld() method with parameter
        person1.growOld(10);  // Grow older by 10 years
        for (int i = 0; i < 3; i++) {
            person2.growOld(5);  // Grow older by 5 years each time
        }

        // Display final ages
        person1.hiToAll();
        person2.hiToAll();

        // Using getter and setter methods
        System.out.println(person1.getName());  // Read forename
        person1.setName("Lolo");  // Change forename
        System.out.println(person1.getName());  // Check updated forename
        person1.hiToAll();

        // Using beYounger() method
        person1.beYounger();  // Decrease age by 1
        person1.hiToAll();
    }
}
