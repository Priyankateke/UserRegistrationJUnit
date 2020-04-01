package com.userregistration;

public class UserRegistration {
    String NAME_PATTERN="^[A-Z][a-z]{2,}$";

    public boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To User Registration");
    }
}
