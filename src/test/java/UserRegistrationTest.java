import org.example.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {

        @Test
        public void validFirstNameTest() {
            Boolean result = UserRegistration.isValidFirstName("Hari");
            Assertions.assertTrue(result);
        }

        @Test
        public void inValidFirstNameTest() {
            Boolean result = UserRegistration.isValidFirstName("hari");
            Assertions.assertFalse(result);
        }

        @Test
        public void validLastNameTest() {
            Boolean result = UserRegistration.isValidFirstName("Naik");
            Assertions.assertTrue(result);
        }

        @Test
        public void inValidLastNameTest() {
            Boolean result = UserRegistration.isValidFirstName("naik");
            Assertions.assertFalse(result);
        }

        @Test
        public void validEmailTest() {
            Boolean result = UserRegistration.isValidEmail("harinaik@gmail.com");
            Assertions.assertTrue(result);
        }

        @Test
        public void inValidEmailTest() {
            Boolean result = UserRegistration.isValidEmail("Harikddfnvodn");
            Assertions.assertFalse(result);
        }
        @ParameterizedTest
        @ValueSource(strings = {"Hari.Naik007@gmail.com", "Good.007@gmail.com", "Harry.007Naik@gmail.com"})
        public void validEmailTest(String mail) {
            Boolean result = UserRegistration.isValidEmail(mail);
            Assertions.assertTrue(result);
        }

        @ParameterizedTest
        @ValueSource(strings = {"Hari#gmail.com",
                "Harigmail.com", "205Hari@gmail@com"})
        public void inValidEmailTest(String mail) {
            Boolean result = UserRegistration.isValidEmail(mail);
            Assertions.assertFalse(result);
        }

        @Test
        public void validMobileTest() {
            Boolean result = UserRegistration.isValidMobileNumber("91 9123456789");
            Assertions.assertTrue(result);
        }

        @Test
        public void inValidMobileTest() {
            Boolean result = UserRegistration.isValidMobileNumber("9123456789");
            Assertions.assertFalse(result);
        }

    }

