package Methods;

public class Replit189_Method_withString {
    public static void main(String[] args) {
        boolean word=isError("error foo bar");
        System.out.println(word);
    }
    public static boolean isError(String line) {
        if(line.startsWith("error")){
            return true;
        }else{
            return false;
        }

    }
}
