import org.example.UserRegistration;
import org.junit.Assert;


import org.junit.Test;

    public class UserRegistrationTest {

        @Test
        public void validFirstNameTest() {
            Boolean result = UserRegistration.isValidFirstName("Hari");
            Assert.assertTrue(result);
        }

        @Test
        public void inValidFirstNameTest() {
            Boolean result = UserRegistration.isValidFirstName("hari");
            Assert.assertFalse(result);
        }

        @Test
        public void validLastNameTest() {
            Boolean result = UserRegistration.isValidFirstName("Naik");
            Assert.assertTrue(result);
        }

        @Test
        public void inValidLastNameTest() {
            Boolean result = UserRegistration.isValidFirstName("naik");
            Assert.assertFalse(result);
        }

        @Test
        public void validEmailTest() {
            Boolean result = UserRegistration.isValidEmail("harinaik@gmail.com");
            Assert.assertTrue(result);
        }

        @Test
        public void inValidEmailTest() {
            Boolean result = UserRegistration.isValidEmail("Harikddfnvodn");
            Assert.assertFalse(result);
        }

        @Test
        public void validMobileTest() {
            Boolean result = UserRegistration.isValidMobileNumber("91 9123456789");
            Assert.assertTrue(result);
        }

        @Test
        public void inValidMobileTest() {
            Boolean result = UserRegistration.isValidMobileNumber("9123456789");
            Assert.assertFalse(result);
        }

    }

