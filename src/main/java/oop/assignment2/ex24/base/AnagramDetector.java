package oop.assignment2.ex24.base;

import java.util.Arrays;

//get length
//get characters

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {

        //get length of strings
        int n1 = word1.length();
        int n2 = word2.length();

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // string to character array
        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();

        // sort characters
        Arrays.sort(string1);
        Arrays.sort(string2);

        // compared sorted check
        Arrays.equals(string1, string2);
            return true;
    }
}
