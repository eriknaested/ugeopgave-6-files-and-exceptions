package Opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<Drink> coffeeMenu = new ArrayList<>();
    String header;

    public Cafe() {
        loadData();
    }

    public void loadData() {
        File file = new File("src/Opgave6/data/menu.csv");
        try {
            Scanner reader = new Scanner(file);
            header = reader.nextLine();
            String[] values;
            while (reader.hasNextLine()) {
                values = reader.nextLine().split(",");
                Drink drink = new Drink(values[0].trim(), Integer.parseInt(values[1].trim()));
                drink.setSoldNumber(Integer.parseInt(values[2].trim()));
                coffeeMenu.add(drink);
            }
            reader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File does not exist" + fnfe.getMessage());
        }
    }

    public void saveData() {
        try {
            FileWriter writer = new FileWriter("src/Opgave6/data/menu.csv");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showMenu() {
        System.out.println(" --- COFFEE MENU --- ");
        System.out.println(header);
        int number = 1;
        for (Drink drink : coffeeMenu) {
            System.out.println(number + ": " + drink.toString());
            number++;
        }
        System.out.println("0: Quit");
    }

    public ArrayList<Drink> getCoffeeMenu() {
        return coffeeMenu;
    }

    public int promptNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void buyCoffee() {
        String msg = "Choose a coffee";
        while (promptNumber(msg) != 0) {
            Drink selectedDrink = coffeeMenu.get(promptNumber(msg) - 1);
            System.out.println("You have chosen: " + selectedDrink.getName() + ". Price: " + selectedDrink.getPrice() + " kr.");
            selectedDrink.setSoldNumber(+ 1);
        }
    }
}

