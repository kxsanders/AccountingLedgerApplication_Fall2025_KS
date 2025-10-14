package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class TransactionManager {
    //This class handles adding new deposits or payments



    //Add deposit
    public static void addDeposit(String description, String vendor, double amount) {

        //deposit is a positive amount
        Transaction deposit = new Transaction(LocalDate.now(), LocalTime.now(), description, vendor, amount);
        FileManager.writeTransaction(deposit);
        System.out.println("Deposit successfully added!");
    }


    //Make payment
    public static void makePayment(String description, String vendor, double amount){

        //payment is a negative amount
        //if the user types a positive number:
        //then the IF statement automatically flips it to a negative number.

        if(amount > 0) {   //checks if amount entered is positive
            amount *= -1; //multiplying the number by -1 makes it a negative number
        }

        Transaction payment = new Transaction(LocalDate.now(), LocalTime.now(), description, vendor, amount);
        FileManager.writeTransaction(payment);
        System.out.println("Payment successfully added!");

    }
}
