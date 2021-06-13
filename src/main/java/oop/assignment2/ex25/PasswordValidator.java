package oop.assignment2.ex25;

// fewer than 8 char and only number is very weak (no digits)
// fewer than 8 char and only letter is weak (only digit, less than 8)
// at least 8 char and 1 numb is strong (more than 8, no special)
// at least 8 char, numbers, special char is very strong (more than 8, special (not a digit = does not equal?))

public class PasswordValidator {

    public int rankPassword(String password1) {

        boolean gotNums;
        boolean gotLetters;
        boolean gotSpecials;
        boolean passLength

        //check length
        if(password1.length() < 8){
            passLength = true;
        }

        //set to array
        char[] passArray = password1.toCharArray();
        for (int i = 0; i < passArray.length; i++) {

            //Digit check
            if (Character.isDigit(passArray[i])) {
                gotNums = true;
            }

            if (Character.isLetter(passArray[i])) {
                gotLetters = true;
            }

            if (!Character.isDigit(passArray[i]) && !Character.isLetter(passArray[i])) {
                gotSpecials = true;
            }

            //check characters
        }
    }
}
