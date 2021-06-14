package oop.assignment2.ex27.base;

public class ValidateNameTwo {
    public boolean validname2(String name2) {
        if (name2.length() < 1) {
            System.out.println("The last name must be filled in");
            return false;
        }
        if (name2.length() < 2) {
            System.out.println("The last name must be at least 2 characters long");
            return false;
        }
        return true;
    }
}
