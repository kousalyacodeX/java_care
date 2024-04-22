public class arrays {
    public static void main(String[] args) {


        //arrays delectation and initialization
        //marks -> 5

        //first method!
        int [] marks = new int[5]; // one dimensional arrays!

                marks[0] = 75;
        marks[1] = 90;
        marks[2] = 45;
        marks[3] = 95;
        marks[4] = 65;

        //second methode!
       // int marks1 [] = {0,90,28,34,45};
       // System.out.println(marks [3]); // accessing particular elements in arrays!
        int sum = 0;
        for(int i = 0; i < marks.length; i++){

            // i = 0; , i < 5-> i 4
            sum = sum + marks[i];
        }
        float avg;
        avg = sum /marks.length;
        System.out.println("Average marks ="+avg);
    }
}

