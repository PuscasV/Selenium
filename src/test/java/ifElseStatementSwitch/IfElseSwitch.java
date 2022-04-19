package ifElseStatementSwitch;

import org.junit.jupiter.api.*;

import java.util.Locale;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class IfElseSwitch {


    @Test
    public void ifAddHttp(){
        String url = "www.selenium-simplified.com";
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

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    private String likelyGenderIs(String title) {

        String  likelyGender;

        switch (title.toLowerCase()){

            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
        }


    }

