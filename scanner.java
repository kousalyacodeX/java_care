import java.util.Scanner;
public class scanner {

    public static void main(String[] agrs){
        Scanner Scanner = new Scanner(System.in);
        // ask a Q?
        System.out.println("what is your name?");
        //response
        String name = Scanner.nextLine();
        // displya that response
        System.out.println("hello "+name+" !");

    }
}

