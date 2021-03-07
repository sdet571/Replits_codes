package Methods;

public class Replit170_Method_withString {
    public static void main(String[] args) {

       String word= clean("one two three", "one");
        System.out.println(word.trim());

    }
    public static String clean (String text ,String badWord) {

       String word1=text.replace(badWord, "");
       return word1;

    }
}
