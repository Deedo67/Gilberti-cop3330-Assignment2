package oop.assignment2.ex26;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

//Prompt for the card’s APR. Do the division internally.
//Prompt for the APR as a percentage, not a decimal.
//Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which returns the number of months.
//Round fractions of a cent up to the next cent.

public class solution26 {
    private static final Scanner in = new Scanner(System.in);

    private static double bal;
    private static double apr;
    private static double monPay;

    public static void main(String[] args){

        readUserInput();

        PaymentCalculator pc = new PaymentCalculator();
        double result = pc.payCalculator(bal, apr, monPay);

        System.out.printf("It will take you %.0f months to pay off this card", result);
    }

    public static void readUserInput() {
        System.out.println("What is your balance? ");
        double bal = in.nextDouble();

        System.out.println("What is the APR on the card (as a percent)? ");
        double apr = in.nextDouble();

        System.out.println("What is the monthly payment you can make? ");
        double monPay = in.nextDouble();
    }

}
