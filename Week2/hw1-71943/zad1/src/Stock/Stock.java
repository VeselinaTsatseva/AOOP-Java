package Stock;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    //Constructs a stock with a specified symbol and a name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double price) {
        previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        currentPrice = price;
    }

    //returns the percentage of change
    public double changePercent() {
        return 100 * ((getCurrentPrice() - getPreviousClosingPrice()) / getPreviousClosingPrice());
    }
}
