public class quiz3 {
/*Write a Java program that finds the largest element in an array of integers

"Declare an array of integers and initialize it with some values.
Find and display the largest element in the array."

*/
        public static void main(String[] args) {
            // Declare and initialize an array of integers
            int[] numbers = {10, 35, 17, 42, 25, 63, 81, 39};

            // Initialize a variable to store the largest element, initially set to the first element of the array
            int largest = numbers[0];

            // Iterate through the array to find the largest element
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            // Display the largest element
            System.out.println("The largest element in the array is: " + largest);
        }
    }

