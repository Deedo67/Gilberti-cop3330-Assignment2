package oop.assignment2.ex27.base;

import java.util.Scanner;

public class solution27 {

    private static final Scanner in = new Scanner(System.in);

    private static String name1;
    private static String name2;
    private static String zip;
    private static String id;

    public static void main(String[] args) {
        readUserInput();
    }
    public static void readUserInput() {
        System.out.println("Enter your first name.");
        name1 = in.next();

        System.out.println("Enter your last name.");
        name2 = in.next();

        System.out.println("Enter your zip code.");
        zip= in.next();

        System.out.println("Enter your employee ID.");
        id = in.next();
    }
}
