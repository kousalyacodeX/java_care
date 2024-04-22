public class arrays2d {
    public static void main(String[] args) {
        int st_marks[][] = {{88, 99, 70, 50, 80, 80}, {77, 89, 56, 68, 97, 90}, {93, 80, 89, 73, 78, 90}, {90, 76, 70, 60, 97, 90}, {90, 90, 89, 90, 80, 90}, {92, 93, 87, 67, 66, 87}};
        for (int i = 0; i < st_marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < st_marks[i].length; j++) {
                sum = sum + st_marks[i][j];     // [0][0]->[0][1]->[0][2]->[0][3]->

            }
            System.out.println("total marks of Stuudent " + i + "=" + sum);
        }
    }
}
