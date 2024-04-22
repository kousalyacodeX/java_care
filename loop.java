public class loop {
// for look challanges

    /*  Write a Java program that calculates the sum of all even numbers from 1 to 100 (inclusive) using a for loop.Use a for loop to iterate through numbers from 1 to 100 (inclusive).
Check if each number is even (i.e., divisible by 2).
If a number is even, add it to a running total.
Finally, display the sum of all even numbers from 1 to 100*/


    public static void main(String[] args) {
            /*
            // Initialize a variable to store the sum of even numbers
            int sum = 0;

            // Iterate through numbers from 1 to 100 (inclusive)
            for (int i = 1; i <= 100; i++) {
                // Check if the current number is even
                if (i % 2 == 0) {
                    // If the number is even, add it to the sum
                    sum += i;
                }
            }

            // Display the sum of even numbers from 1 to 100
            System.out.println("Sum of even numbers from 1 to 100: " + sum);
        }
    }


        int i = 5;
        while (i >= 1) {
            System.out.print(i + "");
            i--;

        }
    }
}*/
/*
                // Declare and initialize the integer variable 'number'
                int number = 5; // Change this to any positive integer

                // Declare another integer variable 'fact' to store factorial of 'number'
                int fact = 1;

                // Use a while loop to calculate the factorial
                int i = 1;
                while (i <= number) {
                    fact *= i; // Multiply 'fact' by 'i' and update 'fact'
                    i++; // Increment 'i'
                }

                // Display the calculated factorial to the user
                System.out.println("Factorial of " + number + " is: " + fact);
            }
        }
*/

        int x= 2;
        int y = 0;
        for(;y < 10;++y) {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else
                System.out.println(y + "");

        }}}
