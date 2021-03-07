package NewReplits;

public class Replit237_Common_divisor {
    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
        System.out.println(commonDivisor(36, 60)); //20
    }


    public static int commonDivisor(int m, int n){
/*
        int gcd=1;
        for(int i=1; i<=m && i<=n; i++){
            if(m%i==0 && n%i==0 ){
                gcd=i;
            }
        }

        return gcd;

 */


     // second way to do it


        // my GCB is 36,60
        while(m!=n){ // condition is false // 60- 36, 24 -36
            //36!=60  // true 24 !=36 true
            if(m>n){// when loop will run 1st condition will be false, second time loop run this condition will be true
                //36>60 //false
                m-=n; //36-=60 //false  // 36-24=12

            }else{ // condition is true
                n-=m;
                //60-36=24   // my n become 24
            }
        }

        // When loop run first time else block will executed, when loop run second time if block will be true and will be executed

        return m;



    }
}
