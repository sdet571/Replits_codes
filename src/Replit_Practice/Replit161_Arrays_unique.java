package Replit_Practice;

import java.util.Scanner;

public class Replit161_Arrays_unique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count=0;
        for(int a=0; a< nums.length; a++){
            count=0;
            for(int i=0; i< nums.length; i++){
                if(nums[i]==nums[a]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(nums[a]);
            }
        }




    }

}
