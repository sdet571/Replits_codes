package Methods;
/*
In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
 First method should work with array of integers (int[]) and return int, and second method should work with an
 array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */
public interface Replit176_Methods_Overloading {
    public static void main(String[] args) {

        int[]arr={1,2,45,6,9,10};
        double[]arr1={1,2,45,6,9,10};

        System.out.println(findMax(arr));
        System.out.println(findMax(arr1));
    }

    public static int findMax(int []num){

      int max=0;
        for(int i=0; i<num.length; i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;

    }

    public static double findMax(double []num){

        double max=0;
        for(int i=0; i<num.length; i++){
            if(max<num[i]){
                max=num[i];
            }

        }
        return max;

    }
}
