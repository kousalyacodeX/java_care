public class formattingstr {
    public static void main(String[] args) {

        String str1 = "java";
        int mars = 95;
        // string.format()

        String str2 = String.format("Student marks : %d, java programminer : %s", mars,str1);
        System.out.println(str2);

    }
}
