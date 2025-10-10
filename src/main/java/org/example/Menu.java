package org.example;

import java.util.Scanner;

public class Menu {
    //Displays each screen. No switch case here.
    //Handles the user input for navigation between menus.
    //The goal is to return the user's choice to the Main class.

    //Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    //Home Menu Display
    public static void displayHomeMenu() {
        System.out.println("\n--HOME MENU--");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment");
        System.out.println("L) Ledger");
        System.out.println("X) Exit");
        System.out.println("Choose an option by typing the corresponding letter.");
    }

    //Ledger Menu Display
    public static void displayLedgerMenu() {
        System.out.println("\n--LEDGER MENU--");
        System.out.println("A) Display All Entries");
        System.out.println("D) Deposits");
        System.out.println("P) Payments");
        System.out.println("R) Reports");
        System.out.println("H) Return to HOME menu");
        System.out.println("Choose an option by typing the corresponding letter.");
    }

    //Reports Menu Display
    public static void displayReportsMenu(){
        System.out.println("\n--");
        System.out.println("\n--REPORTS MENU--");
        System.out.println("1) Month to Date");
        System.out.println("2) Previous Month");
        System.out.println("3) Year to Date");
        System.out.println("4) Previous Year");
        System.out.println("5) Search by Vendor");
        System.out.println("0) Back to LEDGER menu");
        System.out.println("Choose an option by typing the corresponding number.");
    }

    //GET user choice
    public static String getUserOption(){
        String option = scanner.nextLine().trim().toUpperCase();
        return option;
    }
}
