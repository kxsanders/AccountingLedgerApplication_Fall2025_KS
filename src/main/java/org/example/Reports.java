package org.example;

import java.time.LocalDate;
import java.util.List;


public class Reports {
    //This class looks at all transactions and filters them by time period or vendor name


    //MONTH TO DATE
    public static void monthToDate(List<Transaction> list){

        // If this transaction's date is in the CURRENT month and year, print to screen
        LocalDate today = LocalDate.now();
        for (Transaction t : list) {
            if(t.getDate().getMonth() == today.getMonth() && t.getDate().getYear() == today.getYear()) {
                System.out.println(t); //toString method in Transaction class formats this
            }
        }
    }

    //PREVIOUS MONTH
    public static void previousMonth(List<Transaction> list){
        LocalDate today = LocalDate.now();
        int currentMonth = today.getMonthValue(); //1-12. October is 10.
        int currentYear = today.getYear(); //2025

        int previousMonth = currentMonth - 1;
        int previousYear = currentYear;

        //If it's January, we need to go back to December
        if (previousMonth == 0){
            previousMonth = 12;
            previousYear -= 1;
        }


        System.out.println("\n--PREVIOUS MONTH'S TRANSACTIONS--");
        //checks if this transaction's month/year matches the previous month/year
        for(Transaction t : list){
            int tMonth = t.getDate().getMonthValue();
            int tYear = t.getDate().getYear();

            if (tMonth == previousMonth && tYear == previousYear) {
                System.out.println(t);
            }
        }
    }

    //YEAR TO DATE
    public static void yearToDate(List<Transaction> list) {
        int currentYear = LocalDate.now().getYear();

        for(Transaction t : list){
            if(t.getDate().getYear() == currentYear){
                System.out.println(t);
            }
        }
    }

    //PREVIOUS YEAR
    public static void previousYear(List<Transaction> list){
        int lastYear = LocalDate.now().getYear() - 1;
        for(Transaction t : list){
            if(t.getDate().getYear() == lastYear){
                System.out.println(t);
            }
        }
    }

    //SEARCH BY VENDOR
    public static  void searchByVendor(List<Transaction> list, String vendor){

        boolean found = false; //put this first assuming no transaction had been found yet

        for(Transaction t : list){
            if(t.getVendor().equalsIgnoreCase(vendor)){
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found for vendor: " + vendor);
        }
    }

}
