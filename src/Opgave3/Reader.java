package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public static ArrayList<String> readLines(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner reader = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();

        if (reader.hasNextLine()) {
            reader.nextLine();
        }

        while (reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
        reader.close();
        return lines;
    }
}
