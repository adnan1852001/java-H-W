public class App {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println(stock.getCurrnetPrecent());
    }
    
}


class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock(String sm,String nm,double prevClose,double current) {
        symbol = sm;
        nm = name;
        previousClosingPrice = prevClose;
        currentPrice = current;
    }
    
    public double getCurrnetPrecent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}