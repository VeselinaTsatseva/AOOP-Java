package Stock;

import java.util.Scanner;

public class StockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter symbol: ");
        String symbol = input.nextLine();

        System.out.println("Enter name: ");
        String name = input.nextLine();

        Stock stock = new Stock(symbol, name);

        System.out.println("Enter previous closing price: ");
        double previousClosingPrice = input.nextDouble();
        stock.setPreviousClosingPrice(previousClosingPrice);

        System.out.println("Enter current price: ");
        double currentPrice = input.nextDouble();
        stock.setCurrentPrice(currentPrice);

        int percentageChange = (int) stock.changePercent();

        System.out.printf("Percentage change of %s is %d", stock.getName(), percentageChange);
    }
}
