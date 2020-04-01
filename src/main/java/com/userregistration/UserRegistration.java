package com.userregistration;

public class UserRegistration {
    String NAME_PATTERN="^[A-Z][a-z]{2,}$";
    String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";

    public boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public boolean validateEmailId(String emailId) {
        return emailId.matches(EMAIL_PATTERN);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To User Registration");
    }
}
