package CustomClass;

public class Value {

    private int val = 0;
    private boolean wasModified = false;

    public Value(int a){
        this.val=a;
    }
    public Value(){

    }
    public void setVal(int val){
        this.val=val;
        wasModified=true;
    }

    public boolean wasModified(){

        return wasModified;
    }

    public int getVal(){
        return val;



    }



}
