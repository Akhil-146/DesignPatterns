package Strategy;

public class Stock {
    private double price;
    private double previousPrice;

    public Stock(double price, double previousPrice) {
        this.price = price;
        this.previousPrice = previousPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }
}
