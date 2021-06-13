package oop.assignment2.ex24.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

public class solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        //reads two strings
        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.println("Enter word 1");
        word1 = in.next();

        System.out.println("Enter word 2");
        word2 = in.next();
    }

    public static String generateOutput(boolean isAnagram) {
        String output;
        if(isAnagram) {
            output = "is anagram";
        } else {
            output = "is not anagram";
        }

        return output;
    }
}
