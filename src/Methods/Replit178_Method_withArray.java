package Methods;

import java.util.Arrays;

public class Replit178_Method_withArray {


    public static int[] mergR(int[] a,int[] b) {

        int []arr=new int[a.length+b.length];

        for(int i=0; i<a.length; i++){
            arr[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            arr[a.length+i]=b[i];
        }
        return arr;



    }//end mergR

    public static void main(String[] args) {


       int[] merge= mergR(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(Arrays.toString(merge));
    }
}