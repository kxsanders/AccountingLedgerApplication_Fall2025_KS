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

                    double depositAmount = 0;
                    boolean validDeposit = false;
                    while (!validDeposit){
                        System.out.println("Enter amount: ");
                        String input = scanner.nextLine();
                        try{
                            depositAmount = Double.parseDouble(input);
                            validDeposit = true;
                        }
                        catch(NumberFormatException exception) {
                            System.out.println("Invalid amount. Please enter a valid number.");
                        }
                    }

                    TransactionManager.addDeposit(depositDescription, depositVendor, depositAmount);
                    transactionList = FileManager.getTransactions();
                    break;

                case "P": //Make Payment
                    System.out.println("You chose Make Payment");
                    System.out.println("Enter description of payment: ");
                    String paymentDescription = scanner.nextLine();

                    System.out.println("Enter vendor: ");
                    String paymentVendor = scanner.nextLine();

                    double paymentAmount = 0;
                    boolean validPayment = false;

                    while(!validPayment) {
                        System.out.println("Enter amount: ");
                        String input = scanner.nextLine();
                        try{
                            paymentAmount = Double.parseDouble(input);
                            validPayment = true;
                        }
                        catch(NumberFormatException exception){
                            System.out.println("Invalid amount. Please enter a valid number.");
                        }
                    }

                    TransactionManager.makePayment(paymentDescription, paymentVendor, paymentAmount);
                    transactionList = FileManager.getTransactions();
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
                                    case "1":
                                        Reports.monthToDate(transactionList);
                                        break;
                                    case "2":
                                        Reports.previousMonth(transactionList);
                                        break;
                                    case "3":
                                        Reports.yearToDate(transactionList);
                                        break;
                                    case "4":
                                        Reports.previousYear(transactionList);
                                        break;
                                    case "5":
                                        System.out.println("Enter vendor name: ");
                                        String vendor = scanner.nextLine();
                                        Reports.searchByVendor(transactionList, vendor);
                                        break;
                                    case "0":
                                        inReports = false;
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Try again.");
                                }
                            }
                        }
                        else {
                            Ledger.displayLedgerMenu(transactionList, ledgerOption);
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