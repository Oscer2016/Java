class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPercent;

    double getChangePercent(){
        return (currentPercent - previousClosingPrice)/previousClosingPrice * 100;
    }
}
public class Percent {
    public static void main(String[] args){
        Stock stock = new Stock();
        stock.symbol = "Java";
        stock.name = "Sun Microsystems Inc";
        stock.previousClosingPrice = 4.5;
        stock.currentPercent = 4.35;
        System.out.printf("%.2f%%\n",stock.getChangePercent());
    }
}


