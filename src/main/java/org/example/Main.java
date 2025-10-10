package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //run the menu switchcase

        boolean running = true;

        while(running) {
            Menu.displayHomeMenu(); //call to Menu class, displayHomeMenu method
            String option = Menu.getUserOption();

            switch(option){
                case "D":

            }

        }

    }
}