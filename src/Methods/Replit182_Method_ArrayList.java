package Methods;

import java.util.ArrayList;

public class Replit182_Method_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("hi");
        a.add("there");
        a.add("howdy");
        a.add("woo");
        test(a);
        System.out.println(a);
    }

    public static void test(ArrayList<String> words) {
      words.set(0, "git");
      words.set(2, "gud");
        System.out.println(words);

    }
}
