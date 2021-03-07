package CustomClass;

public class StoreProduct {
    String label;
    Integer price;
    String category="misc";
    boolean hasExpiration;
    int stock=0;


    public StoreProduct(String label, Integer price,String category,boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
       // this(label, price, category, hasExpiration, stock);

    }

    public StoreProduct(String label, Integer price, int stock){
        this(label, price);
        this.stock=stock;
        //this.label=label;
        //this.price=price;
        //this.stock=stock;


    }
    public StoreProduct(String label, Integer price){
        this.label=label;
        this.price=price;


    }
    public StoreProduct(String label, Integer price,String category,boolean hasExpiration){
        this(label, price);
        this.category=category;
        this.hasExpiration=hasExpiration;
    }

    public void expired(boolean hasExpiration){
        if(hasExpiration){
           stock=0;
        }
    }

    public boolean sale(int quantity){
        if(quantity<=stock){
            stock=stock-quantity;
            return true;
        }else{
            return false;
        }

    }

    public double getDiscountedPrice(double discount){
            return price*(1-discount);

    }


}


