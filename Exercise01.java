//public class Exercise01 {
    /*Design a Java program to model a hierarchy of vehicles.
    Create a base class Vehicle with methods for displaying information about a
     generic vehicle (e.g., "This is a vehicle.") and for calculating and displaying the fuel
     consumption for a generic vehicle (e.g., "Fuel consumption: X mpg").
     Then, create two subclasses Car and Motorcycle that inherit from the base class and override
    these methods to provide specific information and fuel consumption values for each type of vehicle.
     */

    // Base class Vehicle
    /*class Vehicle {
        // Method to display information about a generic vehicle
        public void displayInfo() {
            System.out.println("This is a vehicle.");
        }

        // Method to calculate and display fuel consumption for a generic vehicle
        public void calculateFuelConsumption() {
            System.out.println("Fuel consumption: X mpg");
        }
    }

    // Subclass Car
    class Car extends Vehicle {
        // Override method to display specific information for a car
        @Override
        public void displayInfo() {
            System.out.println("This is a car.");
        }

        // Override method to calculate and display fuel consumption for a car
        @Override
        public void calculateFuelConsumption() {
            System.out.println("Fuel consumption: Y mpg (car)");
        }
    }

    // Subclass Motorcycle
    class Motorcycle extends Vehicle {
        // Override method to display specific information for a motorcycle
        @Override
        public void displayInfo() {
            System.out.println("This is a motorcycle.");
        }

        // Override method to calculate and display fuel consumption for a motorcycle
        @Override
        public void calculateFuelConsumption() {
            System.out.println("Fuel consumption: Z mpg (motorcycle)");
        }
    }

    public class VehicleHierarchy {
        public static void main(String[] args) {
            // Create instances of Car and Motorcycle
            Car myCar = new Car();
            Motorcycle myMotorcycle = new Motorcycle();

            // Display information and fuel consumption for each vehicle
            System.out.println("Car:");
            myCar.displayInfo();
            myCar.calculateFuelConsumption();

            System.out.println("\nMotorcycle:");
            myMotorcycle.displayInfo();
            myMotorcycle.calculateFuelConsumption();
        }
    }

}
*/