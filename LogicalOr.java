public class LogicalOr {

    public static  void main (String [] argu){

        int  num1 = 120;
        int num2 = 129;
        int y = 10;
        int n = 29;
        boolean result = (num1 < num2) && (y < n);
        System.out.println(result);
        boolean result1 = (num1 > num2) || (y < n);
        System.out.println(result1);

    }

}
