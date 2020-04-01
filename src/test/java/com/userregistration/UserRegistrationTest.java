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
}
