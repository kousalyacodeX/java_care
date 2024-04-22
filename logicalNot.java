public class logicalNot {
    public static  void  main(String [] args){

            int  num1 = 120;
            int num2 = 129;
            int y = 10;
            int n = 29;
            boolean result = (num1 < num2) && (y < n);
            System.out.println(result);
            boolean result1 = (num1 > num2) || (y < n);
            System.out.println(result1);
            boolean result2 = ! (num1 > num2) ;
            System.out.println(result2);

        }

    }


