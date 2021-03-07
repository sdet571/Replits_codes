package Methods;
import java.util.ArrayList;
import java.util.Arrays;

public class Replit177_DeclaringArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=test();
        System.out.println(numbers);
    }


    public static ArrayList<Integer> test() {

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));

        return nums;



    }
}
