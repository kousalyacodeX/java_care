public class explicit {
    public  static void main(String [] args){
       // implicit

        int radius = 600;
        double newradius = radius;
        System.out.println(newradius);

       //explicit
        double diameter = 800.25;
        int newdiameter = (int)diameter;
        System.out.println(newdiameter);

    }
}

