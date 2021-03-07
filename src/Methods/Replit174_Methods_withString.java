package Methods;
/*
The method gets a string and returns a string minus the first string.
for example:
removeFirst("aaa")
returns "aa"

 */
public class Replit174_Methods_withString {
    public static void main(String[] args) {
        String first=removeFirst("bac");
        System.out.println(first);

    }


    public static String removeFirst(String target) {

        String word=target.substring(1, target.length());
        return word;

    }
}
