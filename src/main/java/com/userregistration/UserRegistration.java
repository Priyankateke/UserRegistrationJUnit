package com.userregistration;

public class UserRegistration {
    String NAME_PATTERN="^[A-Z][a-z]{2,}$";
    String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    String MOBILE_NUMBER_PATTERN="^[0-9]{1,3}[' '][0-9]{10}$";

    public boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public boolean validateEmailId(String emailId) {
        return emailId.matches(EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return mobileNumber.matches(MOBILE_NUMBER_PATTERN);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To User Registration");
    }
}
