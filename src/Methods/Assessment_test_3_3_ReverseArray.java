package Methods;

import java.util.ArrayList;
import java.util.Arrays;
/*
Write the definition of a method reverse, whose parameter is an array of Strings.
The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */

public class Assessment_test_3_3_ReverseArray {
    public static void main(String[] args) {
        String[]a={"apple", "pear"};
       String []b= reverse(a);
        System.out.println(Arrays.toString(b));

    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {

       String[]RevAr=new String[arr.length];//we need new Array to add up our new reverse array.
/*
        //     i        k
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];
*/
         int k=arr.length-1;// length of my array
         for(int i=0; i<arr.length; i++){
         RevAr[i]=arr[k];// i is my RevAr index because it will accumulate all the indexes from the arr.length-1;
         k--;// an we need a decrement for length-1 to index 0. K is a index of arr. Its starts from last index the beginning index

        }

        return RevAr;




    }
}