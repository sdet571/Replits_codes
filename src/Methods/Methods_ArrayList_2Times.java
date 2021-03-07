package Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_ArrayList_2Times {
    public static void main(String[] args) {

        ArrayList<Integer>times=new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(times));

    }

    public static ArrayList<Integer>twoTimes(ArrayList<Integer> nums){


        ArrayList<Integer>repeat=new ArrayList<>();

        for(int i=0; i<nums.size(); i++){
            int count=0;
            for(int a=0; a<nums.size(); a++) {
                if (nums.get(a).equals(nums.get(i))) {
                    count +=1;
                }
            }
            if (count ==1) {
                repeat.add(i+1,nums.get(i));
            }
        }

       // System.out.println(nums);

       return nums;



/*       // most accurate way - ****************************** -

        ArrayList<Integer>repeat=new ArrayList<>();
        for(int i=0; i<nums.size(); i++){
            repeat.add(nums.get(i));
        }
        int count=0;
        for(int a=0; a<nums.size(); a++){
            repeat.add(count, nums.get(a));
            count+=2;
        }
        return repeat;

 */



    }
}
