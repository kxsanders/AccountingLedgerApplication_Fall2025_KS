package org.example;

import java.util.List;

public class Ledger {

    //Display all entries
    public static void displayAll(List<Transaction> list){

        System.out.println("\n--ALL ENTRIES/TRANSACTIONS (Newest First)--");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    //Display only the entries that are deposits into account (positive amount)
    public static void displayDeposits(List<Transaction> list){
        System.out.println("\n--DEPOSITS (Newest First)--");

        for (int i = list.size() - 1; i >= 0; i--){
            Transaction t = list.get(i);
            if (t.getAmount() > 0) {
                System.out.println(t);
            }
        }
    }


    //Display entries that are payments (negative)
    public static void displayPayments(List<Transaction> list){
        //same thing as deposits, just switch > with < on t.getAmount

        System.out.println("\n--PAYMENTS (Newest First)--");

        for (int i = list.size() - 1; i >= 0; i--){
            Transaction t = list.get(i);
            if (t.getAmount() < 0) {
                System.out.println(t);
            }
        }
    }

    //Ledger Menu LOGIC
    public static void displayLedgerMenu(List<Transaction> list, String userOption){
        if(userOption.equalsIgnoreCase("A")) {
            displayAll(list);
        }
        else if(userOption.equalsIgnoreCase("D")) {
            displayDeposits(list);
        }
        else if(userOption.equalsIgnoreCase("P")) {
            displayPayments(list);
        }
        else if(userOption.equalsIgnoreCase("R")) {
            //Will navigate to Reports menu (will be handled in MAIN class)
        }
        else if(userOption.equalsIgnoreCase("H")) {
            //Back to HOME menu (will be handles in MAIN class)
        }
        else {
            System.out.println("Invalid option. Try again.");
        }
    }
}
