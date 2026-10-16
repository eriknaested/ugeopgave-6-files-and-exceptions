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
    }

    public void loadData() {
        File file = new File("src/Opgave6/data/menu.csv");
        try {
            Scanner reader = new Scanner(file);         //Scanner oprettes
            header = reader.nextLine();                 //Header skippes
            String[] values;                            //String array oprettes
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
            writer.write("Name, Price, SoldNumber\n");

            for (Drink drink : coffeeMenu) {
                writer.write(drink.toString());
                writer.write("\n");
            }
            writer.close();
            System.out.println("Coffee menu updated");
        } catch (IOException e) {
            System.out.println("IO exception" + e.getMessage());
        }
    }

    public void showMenu() {
        loadData();
        System.out.println(" --- COFFEE MENU --- ");
        System.out.println(header);
        int number = 1;
        for (Drink drink : coffeeMenu) {
            System.out.println(number + ": " + drink.toString());
            number++;
        }
        System.out.println("0: Finish order");

        String msg = "Choose a coffee";
        int choice;
        double sum = 0;
        while ((choice = promptNumber(msg)) != 0) {
            Drink selectedDrink = coffeeMenu.get(choice - 1);
            System.out.println("You have chosen: " + selectedDrink.getName() + ". Price: " + selectedDrink.getPrice() + " kr.");
            selectedDrink.setSoldNumber(selectedDrink.getSoldNumber() + 1) ;
            sum += selectedDrink.getPrice();
        }
        System.out.println("Total price of order: " + sum + " kr.");
        saveData();
    }

    public ArrayList<Drink> getCoffeeMenu() {
        return coffeeMenu;
    }

    public int promptNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

