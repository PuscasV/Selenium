package testAppEnvironmentPackage;


import static objectDomain.TestAppEnv.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){

        assertEquals("http://192.123.0.3:67",
           getUrl());

    }

    @Test
    public void canGetDomainAndPortStatically(){

        assertEquals("192.123.0.3",
                DOMAIN);
        assertEquals("67",
                PORT);
    }

}
