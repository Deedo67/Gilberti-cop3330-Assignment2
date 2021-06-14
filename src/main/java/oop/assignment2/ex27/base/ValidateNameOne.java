package oop.assignment2.ex27.base;

public class ValidateNameOne {
    public boolean validname1(String name1) {
        if (name1.length() < 1) {
            System.out.println("The first name must be filled in");
            return false;
        }
        if (name1.length() < 2) {
            System.out.println("The first name must be at least 2 characters long");
            return false;
        }
        return true;
    }
}
