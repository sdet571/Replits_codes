package NewReplits;

import java.util.Arrays;

public class Combine_to_FullName {
    public static String[] combineNames   (String[] first_names, String[] last_names) {
        String[] FullName=new String[first_names.length];
        for(int i=0; i<first_names.length; i++){
            FullName[i]=first_names[i]+" "+last_names[i];
        }
        return FullName;
    }

    public static void main(String[] args) {

        String[] a={"bob","joe"};
        String[] b={"jones","smith"};
        System.out.println(Arrays.toString(combineNames(a,b)));
    }
}
