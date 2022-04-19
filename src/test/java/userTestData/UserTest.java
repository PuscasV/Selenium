package userTestData;

import domainUser.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class UserTest {

    @Test
    public void canConstructAnewUser(){

        User user = new User("username", "password");

        user.setUserName("Vlad");

        assertEquals("Vlad",
                user.getUserName());
        assertEquals("password",
                user.getPassword());

    }

    @Test
    public void stringConcatenation(){

        String x = "Vlad are mere si Caliniee are pere";

        assertEquals(true, x.contains("pere"),"tralalala");

    }
}
