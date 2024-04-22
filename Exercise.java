public class Exercise {
    /*Create a Java class named Calculator with the following static members:

    A static variable result (an integer) to store the result of calculations.
    A static method add(int a, int b) that takes two integers as parameters and adds them, storing the result in the result variable.
    A static method subtract(int a, int b) that takes two integers as parameters and subtracts b from a, storing the result in the result variable.
    A static method getResult() that returns the current value of the result variable.
    In your main method, perform the following operations:

    Call the add method with two integers (e.g., 5 and 3).
    Call the getResult method to retrieve and display the result.
    Call the subtract method with two integers (e.g., 10 and 4).
    Call the getResult method again to retrieve and display the updated result.*/


        // Static variable to store the result of calculations
        private static int result;

        // Static method to add two integers and store the result
        public static void add(int a, int b) {
            result = a + b;
        }

        // Static method to subtract b from a and store the result
        public static void subtract(int a, int b) {
            result = a - b;
        }

        // Static method to retrieve the current value of the result variable
        public static int getResult() {
            return result;
        }

        public static void main(String[] args) {
            // Call add method with two integers (e.g., 5 and 3)
            add(5, 3);

            // Display the result after addition
            System.out.println("Result after addition: " + getResult());

            // Call subtract method with two integers (e.g., 10 and 4)
            subtract(10, 4);

            // Display the result after subtraction
            System.out.println("Result after subtraction: " + getResult());
        }
    }


