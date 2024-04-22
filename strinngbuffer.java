public class strinngbuffer {
    public static void main(String[]args){
        StringBuffer str = new StringBuffer("Tessa");
                    // Methods
                   // Parmar
                  // append()->adds

        str.append(" parmar");
        System.out.println(str);

                  //intert()
                 //tessA
        str.insert(0, "java ");
        System.out.println(str);

             //delete()
            // 5-7
        str.delete(5,8);
        System.out.println(str);

           //revers()
        str.reverse();
        System.out.println(str);
    }
}
