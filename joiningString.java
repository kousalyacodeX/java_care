public class joiningString {
    public static void main(String[] args){
        String [] words = {"Hello World, how are you?"};
          //Delimiter
        String sentence = String.join(" ", words);
        System.out.println(sentence);
    }
}
