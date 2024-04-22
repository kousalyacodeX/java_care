public class quiz1 {
        public static void main(String[] args) {
            // Total number of students in the class
            int totalStudents = 90;

            // Number of boys in the class
            int boys = 45;

            // Percentage of students securing grade 'A'
            double percentGradeA = 50.0;

            // Number of boys securing grade 'A'
            int boysGradeA = 20;

            // Calculate total number of students securing grade 'A'
            int totalGradeA = (int) Math.round(totalStudents * (percentGradeA / 100));

            // Calculate number of girls securing grade 'A'
            int girlsGradeA = totalGradeA - boysGradeA;

            // Display the result
            System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
        }
    }
/*The total number of students in a class are 90 out of which 45 are
boys. If 50% of the total students secured grade 'A' out of which
20 are boys, then write a program to calculate the total number of
girls getting grade 'A'.*/