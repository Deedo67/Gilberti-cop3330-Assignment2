package oop.assignment2.ex25;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

// Create a program that determines the complexity of a given password based on these rules:
// A very weak password contains only numbers and is fewer than eight characters.
// A weak password contains only letters and is fewer than eight characters.
// A strong password contains letters and at least one number and is at least eight characters.
// A very strong password contains letters, numbers, and special characters and is at least eight characters.

// Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate
// to determine the password strength. Do not have the function return a string—you may need to support multiple
// languages in the future.
// Use a single output statement.

public class solution25 {

    private static final Scanner in = new Scanner(System.in);

    private static String password1;

    public static void main(String[] args) {

        readUserInput();

        PasswordValidator ad = new PasswordValidator();
        int result = ad.rankPassword(password1);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("Enter your password: ");
        password1 = in.next();
    }

    public static String generateOutput(int rankPassword) {
        String output;
        if(rankPassword == 1) {
            output = ("The password: "+password1+" is a very weak password.");
        } else if(rankPassword == 2) {
            output = ("The password: "+password1+" is a weak password.");
        } else if(rankPassword == 3) {
            output = ("The password: "+password1+" is a strong password.");
        } else if(rankPassword == 4) {
            output = ("The password: "+password1+" is a very strong password.");
        }
        return output;
    }
}
