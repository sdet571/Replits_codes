package NewReplits;

import java.util.Arrays;

/*
  int []sum=new int[nums.length];
        for(int s=0; s<nums.length; s++){
            for(int i=0; i<nums[s].length; i++){
                sum[s]+=nums[s][i];
            }
        }

       return sum;
 */
public class Switch_First_Last_Elements {
    public static void main(String[] args) {
        int []num={1,2,3,4,5};

        System.out.println(Arrays.toString(do_switch(num)) );

    }

    public static int[] do_switch(int[] i) {

        int first=i[0];// Arrays first index
        int last=i[i.length-1]; //Arrays last index

        i[0]=last; // first index == last index
        i[i.length-1]=first;// index last==index first

        return i;


/*
 i[0]=i[i.length-1];
            i[i.length-1]=i[0];
 */

    }
}
