package Methods;

import java.util.ArrayList;
import java.util.Arrays;

public interface Replit190_Methods_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(a));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer>nums){

        ArrayList<Integer> list=new ArrayList<>();

        for(int k=0; k<nums.size();k++){
            if(nums.get(k)>0) {
                list.add(nums.get(k));
            }
        }
       // System.out.println(list);

        int sum=0;
        for(int i=0; i<list.size();i++){
            if(list.get(i)>0) {
                sum+=list.get(i);
            }
        }
      //System.out.println(sum);

        list.add(list.size(),sum);
        //System.out.println(list);

        return list;

    }

}
