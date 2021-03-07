package Methods;

public class Replit194_Method_withString {


    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run"));


    }
    public static boolean isPalindrome(String check) {

        String word="";

        for(int i=check.length()-1; i>=0;i--){
            word+=check.charAt(i);
        }

        check = check.replaceAll(" ","");
        word = word.replaceAll(" ","");




        if(word.equalsIgnoreCase(check)){
            if(check.contains(" ")==word.contains(" ")){
               if(word.equalsIgnoreCase(check)&&check.contains(" ")==word.contains(" ")){
                   return true;
               }else{
                   return false;
               }

            }else{
                return false;
            }

        }else{
            return false;
        }


    }

}

