package Methods;

import java.util.Scanner;

public class Assessment_6_1_MixedCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

       String word="";
        for(int i=0; i<s.length();i++) {
            if (i % 2 == 0) {
            word+=s.substring(i,i+1).toLowerCase(); // when index is 0 ==> lowercase because its even num
            }else{
                word+=s.substring(i,i+1).toUpperCase();//when index is 1 ==> Uppercase because its odd num
            }
        }
        System.out.println(word);
    }
}
