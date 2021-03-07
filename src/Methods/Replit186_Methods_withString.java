package Methods;

public class Replit186_Methods_withString {
    public static void main(String[] args) {

        String a=extractNum("aa2aa3");
        System.out.println(a);

    }

    public static String extractNum(String s) {

        String b="";


        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                b+=s.charAt(i);
            }
        }
        return b;


        //String replace=s.replaceAll("[^\\d.]", "");
        //return replace;

    }
}
