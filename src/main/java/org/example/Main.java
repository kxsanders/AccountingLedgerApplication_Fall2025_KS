package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Load transactions from the CSV file
        List<Transaction> transactionList = FileManager.getTransactions();


        //Run the menu | switchcase
        boolean running = true;

        while(running) {

            Menu.displayHomeMenu(); //call to Menu class, displayHomeMenu method
            String option = Menu.getUserOption();

            switch(option) {
                case "D": //Add Deposit
                    System.out.println("You chose Add Deposit");
                    System.out.println("Enter description of deposit: ");
                    String depositDescription = scanner.nextLine();

                    System.out.println("Enter vendor: ");
                    String depositVendor = scanner.nextLine();

                    System.out.println("Enter amount: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());

                    TransactionManager.addDeposit(depositDescription, depositVendor, depositAmount);
                    break;

                case "P": //Make Payment
                    System.out.println("You chose Make Payment");
                    System.out.println("Enter description of payment: ");
                    String paymentDescription = scanner.nextLine();

                    System.out.println("Enter vendor: ");
                    String paymentVendor = scanner.nextLine();

                    System.out.println("Enter amount: ");
                    double paymentAmount = Double.parseDouble(scanner.nextLine());

                    TransactionManager.makePayment(paymentDescription, paymentVendor, paymentAmount);
                    break;

                case "L": // Ledger
                    System.out.println("You chose Ledger");
                    boolean inLedger = true;

                    while(inLedger) {
                        Menu.displayLedgerMenu();
                        String ledgerOption = Menu.getUserOption();

                        if(ledgerOption.equalsIgnoreCase("H")){ //go back to HOME menu
                            inLedger = false;
                        }
                        else if(ledgerOption.equalsIgnoreCase("R")) { //Reports option
                            boolean inReports = true;

                            while (inReports) {
                                Menu.displayReportsMenu();
                                String reportOption = Menu.getUserOption();

                                switch(reportOption){
                                    case
                                    case
                                    case
                                    case
                                    case
                                }
                            }
                        }
                    }

                    break;
                case "X":
                    System.out.println("Thank you for banking with us! Goodbye.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Try again.");


            }

        }

    }
}