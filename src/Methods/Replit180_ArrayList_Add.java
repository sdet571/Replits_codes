package Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit180_ArrayList_Add {
    public static void main(String[] args) {
        ArrayList<String>str=test();
        System.out.println(str);

    }

    public static ArrayList<String> test()
    {
        ArrayList<String> names = new ArrayList<String>();
       // names.addAll(Arrays.asList("Jen", "Ben", "Den"));
        names.add("Hello");
        names.add("Bye");
        names.add("Adios");


        //leave below code alone
        return names;
    }
}
