package Methods;
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class Replit173_Methods_withString {
    public static void main(String[] args) {

        String word=biggerS("apple", "orange");
        System.out.println(word);

    }
    public static String biggerS(String a ,String b) {

        if(a.length()>b.length()){
            return a;
        }else{
            return b;
        }


    }
}
