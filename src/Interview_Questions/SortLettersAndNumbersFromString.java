package Interview_Questions;

import java.util.Arrays;

public class SortLettersAndNumbersFromString {

    public static void main(String[] args) {
        //OutPut: "CD015ACCCG011899"

        String str =  "DC501GCCCA098911";

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }

        if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
            if(Character.isAlphabetic(str.charAt(i+1))) {

                str2 +=",";

            }

        }

        }

        String[] arr = str2.split(",");

        str ="";

        for(String each: arr) {

            char[] chars=each.toCharArray();

            Arrays.sort(chars);

            for(char eachChar: chars){

                str +=""+eachChar;

            }

        }

        System.out.println(str);

}








    }

