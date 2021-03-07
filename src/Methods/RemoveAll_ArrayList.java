package Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        removeAll( "hi",words);
        System.out.println(words);

    }



    public static void removeAll(String targetWord,ArrayList<String> wordList ){


        wordList.removeAll(Arrays.asList(targetWord));
        //System.out.println(wordList);

    }
}
