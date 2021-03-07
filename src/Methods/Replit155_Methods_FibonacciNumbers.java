package Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit155_Methods_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        if(num<=1){
            System.out.println(num);
        }else{
            System.out.println(num+=(num-1)+(num-2));
        }




    }
}
