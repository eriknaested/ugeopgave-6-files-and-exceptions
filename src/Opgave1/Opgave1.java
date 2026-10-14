package Opgave1;

import java.util.Scanner;

public class Opgave1 {

    Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {
        System.out.println(msg);

        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException nfe) {
            return promptNumber("Fejl! Skriv et gyldigt tal");
        }
    }


}
