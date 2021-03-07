package NewReplits;
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */


import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());


    }

    public static void timeConversion(String s) {

        String []time=s.split(":");// first split the string
        char[]second=time[2].toCharArray();// we need char array for index 2 because because we will need to get rid of pm
                                              // we need char array because we will manipulate the indexes
        int convert=0;// we will hold new time info inside this variable

        if(time[2].contains("PM")){// if index 2 contains pm
            convert=Integer.parseInt(time[0]);// index 0+12==> exactly time wee need; for exmp: --> (07):05:45PM --> 07+12=19, 08-->08+12=20
            convert+=12;// 07+12==>19
            System.out.println(convert+":"+time[1]+":"+second[0]+second[1]);// 19:05:(4+5):45
        }else{
            System.out.println(time[0]+":"+time[1]+":"+second[0]+second[1]);// if 1st condition false return this

        }






//07:05:45PM

    }
}
