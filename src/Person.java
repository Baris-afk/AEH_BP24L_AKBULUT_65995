package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String address;      // New field
    public int yearOfBirth;     // New field

    // Default constructor
    public Person() {
        this.forename = "";
        this.surname = "";
        this.age = 0;
        this.address = "";
        this.yearOfBirth = 0;
    }

    // Constructor with parameters
    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.address = "";
        this.yearOfBirth = 0;
    }

    public void hiToAll() {
        System.out.println("Hi! My name is " + forename + " " + surname + ". I am " + age + " years old.");
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + yearOfBirth);
    }

    // Modified growOld method - now it takes a parameter
    public void growOld(int years) {
        this.age += years;
    }

    // New method - decreases the age by 1
    public void beYounger() {
        if (this.age > 0) {
            this.age -= 1;
        }
    }

    // Getter and Setter for forename
    public String getName() {
        return this.forename;
    }

    public void setName(String name) {
        this.forename = name;
    }

    // Getter and Setter for surname
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
