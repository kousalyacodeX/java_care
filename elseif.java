public class elseif {
    public static void main(String[] args) {
        int per = 60;

// PRINT GRAD
// A -> (90, 100)
// B -> (80, 90)
// C -> (70,80)
// D -> (60,70)
// E -> (< 60)
// ELESE IF LADDER

        if (per > 90 && per <= 100) {
            System.out.println("Grade is A");
        }
        else if (per > 80 && per <= 90){
            System.out.println("Grade is B");
        }
        else if (per > 70 && per <= 80) {
            System.out.println("Grade is C");
        }
        else if (per > 60 && per <= 70) {
            System.out.println("Grade is D");
        }
        else{
                System.out.println("Grade is E");
            }

        }

}
