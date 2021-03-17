package com.qait.automation;
import com.opencsv.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Questionb {

    public static void qwerty () throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter("Greetings.csv"));
        List<String[]> therows = new ArrayList<>();
        String[] header = new String[]{"id", "name", "Greatings"};
        therows.add(header);

        String[] row1 = new String[]{"1", "John", "Happy birthday"};
        String[] row2 = new String[]{"2", "Jerry", "Happy birthday"};
        String[] row3 = new String[]{"3", "James",  "Happy birthday"};
        therows.add(row1);
        therows.add(row2);
        therows.add(row3);
        writer.writeAll(therows);
        writer.close();
        FileReader filereader = new FileReader("Greetings.csv");
        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null) {
            for (String cell : nextRecord) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
