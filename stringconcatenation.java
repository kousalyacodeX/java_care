public class stringconcatenation {
    public static void main(String[] args){

        String firstname = "Tesssa";
        String lastname = "parmar";

        //+ Operator

        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // concat() method

        String fullname1 = firstname.concat(" ").concat(lastname);
        System.out.println(fullname1);

        //String lenght()

        int len = fullname.length();
        System.out.println(len);

        // sunstring sub() - 0, 1, 2, 3->4

        String sub = fullname.substring(0,4);
        System.out.println(sub);


    }
}
