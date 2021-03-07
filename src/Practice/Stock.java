package Practice;

import java.text.DecimalFormat;

public class Stock {
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int  totalShares;
    long marketCap;
    public Stock( String tickerSymbol, String companyName, int price, int  totalShares){
        this.companyName=companyName;
        this.price=price;
        this.totalShares=totalShares;
        this.tickerSymbol=tickerSymbol.toUpperCase();
    }
    public long marketCap(){
        return totalShares*price;
    }
    public void adjustPrice(int value){
        percentChange = (double)(value - price) / price * 100;
        price=value;
        marketCap=totalShares*price;
    }
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        if (percentChange >= 0) {
            return "Ticker Symbol: " + tickerSymbol + "\nCompany: " + companyName +
                    "\nCurrent Price: $" + price + " (+" + df.format(percentChange) + ")" + "\nMarket Cap: $" + marketCap;
        } else { return "Ticker Symbol: " + tickerSymbol + "\nCompany: " + companyName +
                "\nCurrent Price: $" + price + " (" + df.format(percentChange) + ")" + "\nMarket Cap: $" + marketCap;
        }
    }












    public static void main(String[] args) {
        Stock stock=new Stock("goog", "Google, Inc.", 700, 78);
        stock.marketCap();
        stock.adjustPrice(680);
        System.out.println(stock);
    }
}