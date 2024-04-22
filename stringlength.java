public class stringlength {
    public static void main(String[] args) {

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


    }
}