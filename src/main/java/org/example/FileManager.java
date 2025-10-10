package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    //this handles all file read and write with the CSV file.

    //make the method
    public static List<Transaction> getTransactions(){

        List<Transaction> transactionList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("src/main/resources/transactions.csv");
            BufferedReader reader = new BufferedReader(fileReader);
            reader.readLine();

            String line;

            //while the value is NOT null
            while ((line = reader.readLine()) != null) {

                //skip the first line
                System.out.println(line);

                //time to split
                String[] data = line.split("\\|");

                //time to parse
                LocalDate date = LocalDate.parse(data[0]);
                LocalTime time = LocalTime.parse(data[1]);
                String description = data[2];
                String vendor = data[3];
                double amount = Double.parseDouble(data[4]);

                //create the transaction object
                Transaction transaction = new Transaction(date, time, description, vendor, amount);

                //add to list
                transactionList.add(transaction);


            }

            //close the reader so evil peeps can't do nefarious things
            reader.close();
        }

        catch(FileNotFoundException exception) {
            System.out.println("Could not find the file.");
        }
        catch(IOException exception){
            System.out.println("File had a problem.");
        }

        return transactionList;
    }
}
