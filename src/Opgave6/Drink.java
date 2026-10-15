package Opgave6;

public class Drink {

    private String name;
    private int price;
    private int soldNumber;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setSoldNumber(int soldNumber) {
        this.soldNumber = soldNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + soldNumber;
    }
}
