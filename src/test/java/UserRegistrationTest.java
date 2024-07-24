import org.example.CustomException;
import org.example.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    static UserRegistration test = new UserRegistration();
    @Test
    public void validFirstNameTest(){
        try{
            Assertions.assertTrue(test.firstName("Hari"));
        }catch (CustomException e){
            Assertions.fail("Exception should not have been thrown");
        }
    }
    @Test
    public void invalidFirstNameTest(){
        try{
            test.firstName("hari");
            Assertions.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid first name", e.getMessage());
        }
    }

    @Test
    public void validLastNameTest(){

        try{
            Assertions.assertTrue(test.lastName("Naik"));
        }catch (CustomException e){
            Assertions.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void invalidLastNameTest(){
        try{
            test.lastName("naik");
            Assertions.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid last name", e.getMessage());
        }
    }

    @Test
    public void validEmailTest(){
        try{
            Assertions.assertTrue(test.validateEmail("harinaik@gmail.com"));
        }catch (CustomException e){
            Assertions.fail("Exception should not have been thrown");
        }

    }

    @Test
    public void invalidEmailTest(){
        try{
            test.validateEmail("harinaik");
            Assertions.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid email", e.getMessage());
        }
    }

    @Test
    public void validMobileNumberTest(){
        try{
            Assertions.assertTrue(test.validateMobileNumber("91 9618101467"));
        }catch (CustomException e){
            Assertions.fail("Exception should not have been thrown");
        }

    }
    @Test
    public void invalidMobileNumberTest(){
        try{
            test.validateMobileNumber("9618101467");
            Assertions.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid mobile number", e.getMessage());
        }
    }

    @Test
    public void validPasswordTest(){
        try{
            Assertions.assertTrue(test.validatePassword("Hari$007"));
        }catch (CustomException e){
            Assertions.fail("Exception should not have been thrown");
        }
    }
    @Test
    public void invalidPasswordTest(){
        try{
            test.validatePassword("harinaik");
            Assertions.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid password", e.getMessage());
        }

    }



    @ParameterizedTest
    @ValueSource(strings = {
            "hari.naik@gmail.com",
            "hello.man@gmail.com",
            "good.morning@gmail.com",
            "happy.days@gmail.com"
    })

    public void validEmail(String mail){
        try{
            Assertions.assertTrue(test.validateEmail(mail));
        }catch (CustomException e){
            Assertions.fail("Exception should not have been thrown");
        }
    }
}