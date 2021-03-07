package Methods;

import java.util.Arrays;

public class Replit195_Methods_withString {
    public static void main(String[] args) {
        System.out.println(isAnagram("earth", "Heart"));
    }
    public static boolean isAnagram(String word1, String word2) {
        char[]a=word1.toLowerCase().toCharArray();
        char[]b=word2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        //System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(b));
        return Arrays.equals(a, b);
    }
}