package Methods;

public class Assessment_Test_2_4_AppearsTwice {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        boolean a=appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.");
        System.out.println(a);
    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {


        String word=sentence.replaceAll(target,"");

        int count=0;
        for(int i=0; i<sentence.length();i++){
            if(sentence.contains(target)){
                sentence=sentence.replaceFirst(target,"");
                count++;

            }

        }
        //System.out.println(sentence);

        if(count==2){
            return true;
        }else{
            return false;
        }

    }
}


