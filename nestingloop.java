public class nestingloop {
    public static void main(String[] agrs) {
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *


        for (int i = 1; i <= 5; i++) { // outer loop
            for (int j = 1; j <= 5; j++) {
                System.out.println("* ");    // inner loop
            }
            System.out.println();

        }
    }


}