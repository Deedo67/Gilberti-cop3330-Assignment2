package oop.assignment2.ex28.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

public class solution28 {

    private static final Scanner in = new Scanner(System.in);

    /*
    private static int[] arrayNum = new int[5];
    private static int numRun = 0;
     */

    public static void main(String[] args) {

        int[] arrayNum = new int[5];
        int numRun = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            arrayNum[i] = in.nextInt();
            numRun += arrayNum[i];
        }

        System.out.println("The total is "+numRun+".");
    }
}
