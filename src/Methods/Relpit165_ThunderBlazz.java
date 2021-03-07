package Methods;

public class Relpit165_ThunderBlazz {

    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1, int ingredient2, int ingredient3){
    if(available){
        return true;
    }else if(gift){
        return true;
    }else if(1==ingredient1 && 2==ingredient2 && 3==ingredient3){
        return true;
    }else if(3==ingredient1&& 1==ingredient2&& 2==ingredient3){
        return true;
    }else{
        return false;
    }

    }

    public static void main(String[] args) {


       boolean a= getThunderBlazz(true, false, 1,2,3);
        System.out.println(a);

    }
}
