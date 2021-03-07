package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapPosition_ArrayList {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {

        Collections.swap(list,pos1, pos2);
       return list;

    }

    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>( Arrays.asList("one","two","three"));

        System.out.println(swap(words, 0,2));





    }
}
