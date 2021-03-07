package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer>times=new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(times));

    }




    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {

        ArrayList<Integer> repeat = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            for (int j = 0; j < nums.size(); j++) {
                repeat.equals(nums.get(i));
                nums.add(repeat.get(j));

            }
        }
                return nums;

    }

}