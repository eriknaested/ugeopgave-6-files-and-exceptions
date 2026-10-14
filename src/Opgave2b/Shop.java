package Opgave2b;

import java.util.ArrayList;

public class Shop {

    ArrayList<String> items = new ArrayList<>();

    public String getItem(ArrayList<String> items, int index) {
        if (index > items.size() - 1) {
            throw new IllegalArgumentException("Index out of bounds. Index must be between 0 to " + (items.size() - 1));
        }
        return items.get(index);
    }

    public void addItem(String item) {
        items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
