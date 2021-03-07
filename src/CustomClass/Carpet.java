package CustomClass;

public class Carpet {
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;


    public Carpet(){
        this.width=300;
        this.length=300;
        this.totalPrice=200;
        this.isPersian=false;
        this.unitPrice=0;
    }

    public Carpet(double width, double length, double unitPrice,boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;

        if(isPersian){
            this.totalPrice= (width+length)*unitPrice+200;
        }else{
            this.totalPrice= (width+length)*unitPrice;
        }

    }


}
