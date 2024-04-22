//public class Exercise2 {

    /*Problem Statement:

Develop a Java program to manage electronic devices. The program should make use of an abstract class and concrete subclasses to represent different types of electronic devices. Each device has a name and a brand, and it can be powered on and off.

1. Create an abstract class called `ElectronicDevice` with the following properties and methods:
- Properties:
- `name` (String): The name of the electronic device.
- `brand` (String): The brand of the electronic device.
- Abstract methods:
- `powerOn()`: This method should simulate powering on the electronic device.
- `powerOff()`: This method should simulate powering off the electronic device.
- Concrete method:
- `displayDetails()`: This method should display the name and brand of the electronic device.

2. Create two concrete subclasses of `ElectronicDevice`:
- `Smartphone`: This class represents a smartphone. Implement the abstract
 methods `powerOn()` and `powerOff()` to print messages indicating the smartphone is powering on and off, respectively.

- `Laptop`: This class represents a laptop. Implement the abstract methods
`powerOn()` and `powerOff()` to print messages indicating the laptop is powering on and off, respectively.

3. In the `Main` class:
- Create instances of both `Smartphone` and `Laptop`.
- Set the name and brand for each electronic device.
- Display the details of each device (name and brand) using the `displayDetails()` method.
- Simulate powering on and off each device using the `powerOn()` and `powerOff()` methods, respectively.

Your program should demonstrate the use of abstract classes,
concrete subclasses, and method implementation. When executed, it should provide output messages
indicating the status of each electronic device, such as whether it is powering on or off.
     */
    // Abstract class ElectronicDevice
    /* abstract class ElectronicDevice {
        // Properties
        protected String name;
        protected String brand;

        // Constructor
        public ElectronicDevice(String name, String brand) {
            this.name = name;
            this.brand = brand;
        }

        // Abstract methods
        public abstract void powerOn();

        public abstract void powerOff();

        // Concrete method to display details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Brand: " + brand);
        }
    }

    // Concrete subclass Smartphone
    class Smartphone extends ElectronicDevice {
        // Constructor
        public Smartphone(String name, String brand) {
            super(name, brand);
        }

        // Implement powerOn method
        @Override
        public void powerOn() {
            System.out.println(name + " smartphone is powering on.");
        }

        // Implement powerOff method
        @Override
        public void powerOff() {
            System.out.println(name + " smartphone is powering off.");
        }
    }

    // Concrete subclass Laptop
    class Laptop extends ElectronicDevice {
        // Constructor
        public Laptop(String name, String brand) {
            super(name, brand);
        }

        // Implement powerOn method
        @Override
        public void powerOn() {
            System.out.println(name + " laptop is powering on.");
        }

        // Implement powerOff method
        @Override
        public void powerOff() {
            System.out.println(name + " laptop is powering off.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Create instances of Smartphone and Laptop
            Smartphone myPhone = new Smartphone("iPhone", "Apple");
            Laptop myLaptop = new Laptop("MacBook Pro", "Apple");

            // Set name and brand for each device
            // Display details of each device
            System.out.println("Smartphone details:");
            myPhone.displayDetails();
            System.out.println("\nLaptop details:");
            myLaptop.displayDetails();

            // Simulate powering on and off each device
            System.out.println("\nPowering on devices:");
            myPhone.powerOn();
            myLaptop.powerOn();

            System.out.println("\nPowering off devices:");
            myPhone.powerOff();
            myLaptop.powerOff();
        }
    }

}
*/