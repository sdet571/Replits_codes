package NewReplits;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOf_2D_Array {
    public static void main(String[] args) {

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] sums = rowSums(a);
        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }
    public static int[] rowSums(int[][] nums) {
      int []sum=new int[nums.length];
        for(int s=0; s<nums.length; s++){
            for(int i=0; i<nums[s].length; i++){
                sum[s]+=nums[s][i];
            }
        }

       return sum;







    }




}
