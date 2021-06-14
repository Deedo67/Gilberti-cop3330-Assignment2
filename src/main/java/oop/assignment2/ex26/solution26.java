package oop.assignment2.ex26;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

public class solution26 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        readUserInput();

        PaymentCalculator pc = new PaymentCalculator();
    }

    public static void readUserInput() {
        System.out.println("What is your balance? ");
        double bal1 = in.next();

        System.out.println("What is the APR on the card (as a percent)? ");
        double apr = in.next();

        System.out.println("What is the monthly payment you can make? ");
        double monPay = in.next();
    }
}
