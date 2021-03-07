package Methods;

import java.util.*;
public class Assessment_test_4_1_Sorted {
    public static void main(String[] args) {

        int[]n={1,2,3};

        boolean n2=isSort(n);
        System.out.println(n2);

    }

    public static boolean isSort(int[] nums) {

        int[] sort= new int[nums.length];// new Array for assigning the numbers.
        for(int i=0;i<nums.length; i++ ){
           sort[i]=nums[i];//we assign each index of sort array to the sort array.
        }
        Arrays.sort(nums);// Sorting all the  numbers here

       //boolean result=Arrays.equals(nums,sort );
          return Arrays.equals(nums,sort);

    }
}
