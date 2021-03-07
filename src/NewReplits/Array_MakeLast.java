package NewReplits;

import java.util.Arrays;
import java.util.Scanner;

public class Array_MakeLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }


        int [] Numbers=new int[size+size]; // or size*2
        for(int a=0; a<Numbers.length; a++){
            Numbers[a] =Numbers[a];

        }
        Numbers[Numbers.length-1]=nums[nums.length-1];
       System.out.print(Arrays.toString(Numbers));












    }

}
