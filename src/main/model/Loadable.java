package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Loadable {
    static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));
        PrintWriter writer = new PrintWriter("outputfile.txt", "UTF-8");
        lines.add("Mike Chicken Stripes");
        for (String line : lines) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.print("Customer: " + partsOfLine.get(0) + "  ");
            System.out.println("Order: " + partsOfLine.get(1));
            writer.println(line);
        }
        writer.close();
    }

    static ArrayList<String> splitOnSpace(String line) throws IOException {
        String[] splits = line.split(" ");
        return new ArrayList<>(Arrays.asList(splits));
    }
}
