package Methods;

public class Replit179_Methods_withString {
    public static void main(String[] args) {

        String word="Hello World";
        String word2=reverse(word);
        System.out.println(word2);
    }
    public static String reverse(String input) {


        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev+=input.charAt(i);
        }
        return rev;
    }
}
