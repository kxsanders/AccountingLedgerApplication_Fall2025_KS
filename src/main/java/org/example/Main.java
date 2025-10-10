package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Run the menu | switchcase
        boolean running = true;

        while(running) {
            Menu.displayHomeMenu(); //call to Menu class, displayHomeMenu method
            String option = Menu.getUserOption();

            switch(option){
                case "D":
                    System.out.println("You chose Add Deposit");
                    //ADD CODE HERE
                    break;
                case "P":
                    System.out.println("You chose Make Payment");
                    //ADD CODE HERE
                    break;
                case "L":
                    System.out.println("You chose Ledger");
                    //ADD CODE HERE
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