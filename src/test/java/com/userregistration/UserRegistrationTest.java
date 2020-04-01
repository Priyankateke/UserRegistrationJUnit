package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
   UserRegistration validator=new UserRegistration();

   @Test
   public void givenFirstName_WhenProper_ShouldReturnTrue() {
      boolean firstName = validator.validInputName("Priyanka");
      Assert.assertTrue(firstName);
   }

   @Test
   public void givenFirstName_WhenImproper_ShouldReturnFalse() {
      boolean firstName =validator.validInputName("priyu01");
      Assert.assertFalse(firstName);
   }

   @Test
   public void givenLastName_WhenProper_ShouldReturnTrue() {
      boolean lastName = validator.validInputName("Teke");
      Assert.assertTrue(lastName);
   }

   @Test
   public void givenLastName_WhenImproper_ShouldReturnFalse() {
      boolean lastName =validator.validInputName("TEK1");
      Assert.assertFalse(lastName);
   }

   @Test
   public void givenEmailId_WhenProper_ShouldReturnFalse() {
      boolean emailId = validator.validateEmailId("abc@gail.com");
      Assert.assertTrue(emailId);
   }
   @Test
   public void givenEmailId_WhenImproper_ShouldReturnFalse() {
      boolean emailId = validator.validateEmailId("abcgail.com");
      Assert.assertFalse(emailId);
   }

   @Test
   public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
      boolean mobileNumber = validator.validateMobileNumber("91 9804973844");
      Assert.assertTrue(mobileNumber);
   }

   @Test
   public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
      boolean mobileNumber = validator.validateMobileNumber("91 18616253601");
      Assert.assertFalse(mobileNumber);
   }

   @Test
   public void givenEightCharacterLongPassword_WhenProper_ShouldReturnTrue() {
      boolean passwordAtLeastEightCharacterLong = validator.validatePassword("adminroot",validator.PASSWORD_AT_LEAST_EIGHT_CHARACTER_LONG);
      Assert.assertTrue(passwordAtLeastEightCharacterLong);
   }
   @Test
   public void givenEightCharacterLongPassword_WhenImProper_ShouldReturnFalse() {
      boolean passwordAtLeastEightCharacterLong = validator.validatePassword("osroot",validator.PASSWORD_AT_LEAST_EIGHT_CHARACTER_LONG);
      Assert.assertFalse(passwordAtLeastEightCharacterLong);
   }

   @Test
   public void givenAtLeastOneUpperCaseCharacterPassword_WhenProper_ShouldReturnTrue() {
      boolean passwordAtLeastOneUpperCaseCharacter = validator.validatePassword("Adminroot", validator.PASSWORD_AT_LEAST_ONE_UPPERCASE_CHARACTER);
      Assert.assertTrue(passwordAtLeastOneUpperCaseCharacter);
   }

   @Test
   public void givenAtLeastOneUpperCaseCharacterPassword_WhenImproper_ShouldReturnFalse() {
      boolean passwordAtLeastOneUpperCaseCharacter = validator.validatePassword("adminroot", validator.PASSWORD_AT_LEAST_ONE_UPPERCASE_CHARACTER);
      Assert.assertFalse(passwordAtLeastOneUpperCaseCharacter);
   }

   @Test
   public void givenAtLeastNumberPassword_WhenProper_ShouldReturnTrue() {
      boolean passwordAtLeastOneNumber = validator.validatePassword("Adminroot123", validator.PASSWORD_AT_LEAST_ONE_NUMBER);
      Assert.assertTrue(passwordAtLeastOneNumber);
   }
   @Test
   public void givenAtLeastNumberPassword_WhenProper_ShouldReturnFalse() {
      boolean passwordAtLeastOneNumber = validator.validatePassword("adminroot", validator.PASSWORD_AT_LEAST_ONE_NUMBER);
      Assert.assertFalse(passwordAtLeastOneNumber);
   }
}
