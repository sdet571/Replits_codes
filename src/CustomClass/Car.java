package CustomClass;

public class Car {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    int price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, int price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    public Car(String make, String model, int topSpeed, int price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public Car(int topSpeed, int price, int numberOfDoors){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public Car(String make, String model, int numberOfDoors){

        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
    }


}
