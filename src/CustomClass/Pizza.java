package CustomClass;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private  int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings){

        this.size=size;
        this.cheeseToppings=cheeseToppings;
        this.pepperoniToppings=pepperoniToppings;
        this.hamToppings=hamToppings;
    }

    public String getSize(){
        return size;
    }
    public int getCheeseToppings(){
        return cheeseToppings;
    }
    public int getPepperoniToppings(){
        return pepperoniToppings;
    }
    public int getHamToppings(){
        return hamToppings;
    }
    public void setSize(String size){
        this.size=size;
    }
    public void setCheeseToppings(int cheeseToppings){
        this.cheeseToppings=cheeseToppings;
    }
    public void setPepperoniToppings(int pepperoniToppings){
        this.pepperoniToppings=pepperoniToppings;
    }
    public void setHamToppings(int hamToppings){
        this.hamToppings=hamToppings;
    }

    public double calCost(){

        if(size.equalsIgnoreCase("Small")){
            return (cheeseToppings+pepperoniToppings+hamToppings)*2+10;
        }else if(size.equalsIgnoreCase("Medium")){
            return (cheeseToppings+pepperoniToppings+hamToppings)*2+12;
        }else{
            return (cheeseToppings+pepperoniToppings+hamToppings)*2+14;
        }
    }

    public String getDescription(){
        return size+" Pizza with "+cheeseToppings+" Cheese toppings, "+pepperoniToppings+" Pepperoni toppings,"+" and "+hamToppings+" Ham toppings."+"\nTotal Price: "+calCost();
    }

}





class Order{
    public static void main(String[] args) {

        Pizza pizza1=new Pizza("large", 2, 4, 3);
        System.out.println(pizza1.getDescription());

    }
}



