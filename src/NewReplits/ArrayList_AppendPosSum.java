package NewReplits;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_AppendPosSum {
    public static void main(String[] args) {

        ArrayList<Integer>Numbers=new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(Numbers));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){

        ArrayList<Integer>posNum=new ArrayList<>();

       int sum=0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)>=1){
                posNum.add(nums.get(i));
                sum+=nums.get(i);
            }
        }
        posNum.add(sum);
        return posNum;

    }
}
