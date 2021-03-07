package NewReplits;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Front_Piece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

           int [] FirstNums=new int[2];

            if(num.length<2){
                System.out.println(Arrays.toString(num));
            }else{
                FirstNums[0] = num[0];
                FirstNums[1] = num[1];
                System.out.println(Arrays.toString(FirstNums));
        }






    }
}
