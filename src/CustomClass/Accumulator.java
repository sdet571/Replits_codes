package CustomClass;

public class Accumulator {
    Integer sum;


    public Accumulator(Integer sum){
        this.sum=sum;
    }
    public Integer getSum(){
        return sum;
    }

    public void add(Integer num){
        sum+=num;
    }
    public void remove(Integer num2){
        sum-=num2;
    }

    public String toString(){
        return "Sum is: "+sum+" where "+sum+" is the sum instance variable";
    }
}
