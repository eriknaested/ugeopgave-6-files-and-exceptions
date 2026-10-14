package Opgave3b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader3b {

    ArrayList<String> lines = new ArrayList<>();

    public static ArrayList readLines(String path) throws FileNotFoundException{
        ArrayList lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        scan.close();
        return lines;
    }

}
