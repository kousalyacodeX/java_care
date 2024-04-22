public class Exercise1 {
    /*Code a Java program that calculates the area of various geometric shapes,
    including rectangles, circles, and triangles, using method overloading.
    The program should provide flexibility to compute the area of these shapes
    with different sets of input parameters.*/

        // Method to calculate the area of a rectangle
        public static double calculateArea(double length, double width) {
            return length * width;
        }

        // Method to calculate the area of a circle
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        // Method to calculate the area of a triangle given base and height
        public static double calculateArea(double base, double height, String shape) {
            if (shape.equalsIgnoreCase("triangle")) {
                return 0.5 * base * height;
            } else {
                System.out.println("Invalid shape specified.");
                return -1;
            }
        }

        public static void main(String[] args) {
            // Calculate area of a rectangle
            double rectangleArea = calculateArea(5, 8);
            System.out.println("Area of rectangle: " + rectangleArea);

            // Calculate area of a circle
            double circleArea = calculateArea(4);
            System.out.println("Area of circle: " + circleArea);

            // Calculate area of a triangle
            double triangleArea = calculateArea(6, 10, "triangle");
            System.out.println("Area of triangle: " + triangleArea);
        }
    }

