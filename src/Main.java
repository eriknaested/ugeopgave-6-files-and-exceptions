import Opgave1.Opgave1;
import Opgave2.Drink;
import Opgave2b.Shop;
import Opgave3.Reader;
import Opgave3b.Reader3b;
import Opgave6.Cafe;

import javax.xml.catalog.CatalogFeatures;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Opgave1 o = new Opgave1();

        try {
            o.promptNumber("Write a number");
        } catch (NumberFormatException nfe) {
            System.out.println("Error! Please write a valid number");
        }

         */ //Opgave 1


        /* Drink drink = new Drink();

        try {
            drink.setPrice(15);
            System.out.println("Drink cost: " + drink.getPrice());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            drink.setPrice(-5);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

         */ //Opgave 2

        /* Shop shop = new Shop();

        shop.addItem("Computer");
        shop.addItem("Monitor");
        shop.addItem("Headphones");

        try {
            shop.getItem(shop.getItems(), 2);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            shop.getItem(shop.getItems(), 3);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

         */ //Opgave 2b

        /* try {
            ArrayList<String> lines = Reader.readLines("tester.csv");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("1 success");
        } catch (FileNotFoundException fnfe) {
            System.out.println("1 File was not found");
        }

        try {
            ArrayList<String> lines = Reader.readLines("src/tester.csv");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("2 success");
        } catch (FileNotFoundException fnfe) {
            System.out.println("2 File was not found");
        }

         */ //Opgave 3

        /* try {
            ArrayList<String> lines = Reader3b.readLines("src/tester.csv");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("1 success");
        } catch (FileNotFoundException fnfe) {
            System.out.println("1 file not found");
        }

        try {
            ArrayList<String> lines = Reader3b.readLines("tester.csv");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("2 success");
        } catch (FileNotFoundException fnfe) {
            System.out.println("2 file not found");
        }

         */ //Opgave 3b

        /* ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        drinks.add("Latte, Espresso med dampet mælk, 45.0");
        drinks.add("Cola, Kold og brusende, 30.0");
        drinks.add("Water, Stille kildevand, gratis");

        double sum = 0;

        for (String drink : drinks) {
            String[] values = drink.split(",");
            String name = values[0].trim();
            String description = values[1].trim();
            // String price = values[2].trim();
            try {
                double price = Double.parseDouble(values[2].trim());
                sum += price;
                System.out.println(name + " - " + description + " (" + price + " kr.)");
            } catch (NumberFormatException nfe) {
                System.out.println(values[2].trim() + " is not a number");
            }
        }

        System.out.println("Samlet pris for alle drinks: " + sum + " kr.");

         */ //Opgave 4  og 5

        Cafe cafe = new Cafe();

        // int choice = cafe.promptNumber("Choose a coffee: ");
        cafe.showMenu();

    }
}
