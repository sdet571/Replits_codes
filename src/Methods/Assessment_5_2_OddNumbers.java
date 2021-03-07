package Methods;

import java.util.Scanner;
/*
You can assume that the following:
num2 > num1 ==> TRUE

You are to write a program that will print out all the ODD numbers in between num1 and num2 inclusive.
Your output should all be on one line, separated by spaces.
Sample input/output:

#1: 3
#2: 11
3 5 7 9 11
 */

public class Assessment_5_2_OddNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11

        for(int i=num1; i<=num2; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }



    }
}
