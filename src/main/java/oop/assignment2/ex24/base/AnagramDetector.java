package oop.assignment2.ex24.base;

import java.util.Arrays;

//get length
//get characters

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {



        // convert strings to character arrays
        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();

        // sort character arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        // compares sorted words and returns boolean value
        return Arrays.equals(string1, string2);
    }
}
