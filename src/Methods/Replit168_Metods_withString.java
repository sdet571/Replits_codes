package Methods;

public class Replit168_Metods_withString {
    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "o") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {


        String a="";

        if(main.contains(coverME)){
            a=main.replace(coverME, "["+coverME+"]");
        }else{
            a="["+main+"]";

        }

     return a;
    }

}