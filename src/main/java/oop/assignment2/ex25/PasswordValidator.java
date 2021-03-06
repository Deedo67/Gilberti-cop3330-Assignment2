package oop.assignment2.ex25;

import java.util.Arrays;

// fewer than 8 char and only number is very weak (no digits)
// fewer than 8 char and only letter is weak (only digit, less than 8)
// at least 8 char and 1 numb is strong (more than 8, no special)
// at least 8 char, numbers, special char is very strong (more than 8, special (not a digit = does not equal?))

public class PasswordValidator {

    public int rankPassword(String password1) {

        boolean gotNums = false;
        boolean gotLetters = false;
        boolean gotSpecials = false;
        boolean passLength;

        //check length
        if(password1.length() >+ 8){
            passLength = true;
        }
        else{
            passLength = false;
        }

        //set to array
        char[] passArray = password1.toCharArray();

        for (int i = 0; i <= passArray.length; i++) {

            //Digit check
            if (Character.isDigit(passArray[i])) {
                gotNums = true;
            }
            else{
                gotNums = false;
            }
            //Letter check
            if (Character.isLetter(passArray[i])) {
                gotLetters = true;
            }
            else{
                gotLetters = false;
            }
            //if neither letter or num, it is special character
            if (!Character.isDigit(passArray[i]) && !Character.isLetter(passArray[i])) {
                gotSpecials = true;
            }
            else{
                gotSpecials = false;
            }
        }

        if(!passLength && gotNums && !gotLetters && !gotSpecials){
            return 1;
        }
        else if(!passLength && !gotNums && gotLetters && !gotSpecials){
            return 2;
        }
        else if(!passLength && gotNums && !gotLetters && !gotSpecials){
            return 3;
        }
        else if(!passLength && gotNums && !gotLetters && !gotSpecials){
            return 4;
        }
        return 0;
    }
}
