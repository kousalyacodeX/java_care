public class dowhileloop {
    public static void main( String [] args) {
        // sum of first 10 natural numbers
        int s = 0;
        int i = 1;
        do {
            s = s + i;
            i++;
        } while (i <= 10);  //exit controlled loop

// for while -> entry conntrolled loops
        System.out.println("s = " + s);
    }
}
