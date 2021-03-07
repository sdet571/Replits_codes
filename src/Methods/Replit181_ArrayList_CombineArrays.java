package Methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Replit181_ArrayList_CombineArrays {
    public static void main(String[] args) {
        String[] word1 = {"f","o","o"};
        String[] word2 = {" b","a","r"};
        System.out.println(combineRs(word1,word2));

    }
    public static String combineRs(String[] r1,String[] r2)
    {

        ArrayList<String>combine=new ArrayList<>();//add two array list to new single Array list
        combine.addAll(Arrays.asList(r1));
        combine.addAll(Arrays.asList(r2));


        String []str=combine.toArray(new String [combine.size()]);//Create String array size

         String result="";
        for(int i=0; i<str.length; i++){
            result+=str[i];
            //System.out.println(str[i]);
        }
        return result;


        }







}
