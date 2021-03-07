package NewReplits;

import java.util.Arrays;

public class Arrays_AddElements {
    public static void main(String[] args) {

        int []array1={10, 40, 50, 3, 1};
        int []array2={11, 0, 500, 44, 1101};
       int[]sum= addElements(array1, array2);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] arr=new int[ints1.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=ints1[i]+ints2[i];

        }
         return arr;

    }

}
