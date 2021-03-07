package Methods;

public class Extract_Numbers {
    public static void main(String[] args) {
        String word="aa2aa3";
        String a=extractNum(word);
        System.out.println(a);


    }

    public static String extractNum(String s) {

        String result="";
        for(int i=0; i<=s.length()-1;i++){
            if(Character.isDigit(s.charAt(i))){
                result+=""+s.charAt(i);

            }
        }
        return result;


    }
}
