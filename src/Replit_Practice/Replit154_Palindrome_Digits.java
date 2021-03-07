package Replit_Practice;

import java.util.Scanner;

public class Replit154_Palindrome_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){

        String digits=""+num;
        String reverse="";

        for(int i=digits.length()-1; i>=0; i--){
             reverse+=""+digits.charAt(i);
        }

        boolean a=reverse.equals(digits);
        System.out.println(a);



        // Second way to do reversed. Without v=converting to string...
        int reversed=0;

        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }

        System.out.println(reversed);











    }
}
