package ifElseStatementSwitch;

import org.junit.jupiter.api.*;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class IfElseSwitch {


    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url) {

        url = "http://" + url;
        return url;
    }


    @Test
    public void ifTrue(){

        boolean truthy = true;

        if(truthy) {
            assertTrue(truthy);
            out.println("variable is true");
        }
        else {
            assertFalse(truthy);
            out.println("variable is false");
        }


    }
}
