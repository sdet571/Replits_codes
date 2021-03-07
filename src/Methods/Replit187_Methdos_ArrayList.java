package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Replit187_Methdos_ArrayList {

    public static void main(String[] args) {

        ArrayList<String>a1=new ArrayList<>(Arrays.asList("Once","you"," Stop", "learning"));
        ArrayList<String>a2=new ArrayList<>(Arrays.asList("you","start","dying"));

        System.out.println(combineAL(a1,a2));

    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2)
    {

        ArrayList<String>words=new ArrayList<>();

        for(int i=0; i<wordList1.size(); i++){
            words.add(wordList1.get(i));
        }
        for(int i=0; i<wordList2.size(); i++){
            words.add(wordList2.get(i));
        }

        return words;

    }
}