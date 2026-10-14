package Opgave2;

public class Drink {

    private double price;

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
