package Methods;
/*
This method gets a string and an int, it returns a string.
what it dose is limit the inputted string to a cretin number of characters.
for example:
limit("abcd",2)
returns "ab"
limit("bla bla",3)
returns "bla"
hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

 */
public class Replit171_Methods_withString {
    public static void main(String[] args) {

       String b=limit("bla bla",3);
        System.out.println(b);

    }


    public static String limit(String text, int maxLength) {

       String a=text.substring(0,maxLength);

        return a;

    }
}
