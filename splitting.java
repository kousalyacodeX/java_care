public class splitting {
    public static void main(String[] args){
        //splitting:

        String sentence = "Hello World, how are you?";

       // space
        String [] words = sentence.split(" ");
        for(int i = 0; i<words.length;i++){
            System.out.println(words[i]);
        }
    }

}
