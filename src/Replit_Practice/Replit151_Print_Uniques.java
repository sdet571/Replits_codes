package SELF_PRACTICE.Replit_Practice;
import java.util.Scanner;
/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34

 */

public class Replit151_Print_Uniques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE


        for(int i=0; i<nums.length; i++){
           int count=0;
           for(int k=0; k<nums.length; k++){
               if(nums[k]==nums[i]){
                   count++;
               }
           }
            if(count==1) {
                System.out.print(nums[i]);
            }
        }

}
}
