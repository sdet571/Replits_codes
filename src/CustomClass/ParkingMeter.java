package CustomClass;

public class ParkingMeter {

    int timeLeft=0;
    int maxTime;

    public ParkingMeter(Integer num1){
        this.maxTime=num1;
    }

    public boolean add(Integer num2){
        if(num2==25&& timeLeft<=maxTime) {
            timeLeft += 30;
            return true;
        }else{
            return false;
        }
    }
    public void tick(){
        if(timeLeft>0){
            timeLeft--;
        }

    }
    public boolean isExpired(){
        if(timeLeft==0){
            return true;
        }else{
            return false;
        }
    }


}
