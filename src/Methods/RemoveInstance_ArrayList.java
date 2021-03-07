package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class RemoveInstance_ArrayList {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

        Collections.frequency(r,n);
        r.removeAll(Arrays.asList(n));
        return r;

/*
        Predicate<Integer> instance= A -> Collections.frequency(r, A)!=n;
        r.removeIf(instance);
        return r;

 */


    }

    public static void main(String[] args) {

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3,1,4};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }

}
