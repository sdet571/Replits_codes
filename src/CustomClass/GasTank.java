package CustomClass;

public class GasTank {
    double amount=0;
    double capacity;

    public GasTank(double capacity){
        this.capacity=capacity;
    }

    public void addGas(double num) {
        this.amount = amount + num;
        if (amount > capacity) {
            amount = capacity;
        }
    }

    public void useGas(double num2){
        amount=amount-num2;
        if(amount<0){
            amount=0;
        }
    }

    public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(amount>capacity-0.1){
            return true;
        }else{
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        amount=capacity;
        return capacity-=this.amount;
    }

}
