package Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit183_Methods_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>( Arrays.asList(1,3,2));
       int a= sum(nums);
        System.out.println(a);

    }

    public static int sum(ArrayList<Integer> ints)
    {
        int sum=0;
        for(int i=0; i<ints.size();i++){
           sum+=ints.get(i) ;
        }
        return sum;

    }

}
