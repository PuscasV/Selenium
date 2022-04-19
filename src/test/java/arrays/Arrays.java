package arrays;
import org.junit.jupiter.api.Test;
import domainUser.*;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class Arrays {

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for(String numberText : numbers0123){
            out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void numberArrayExample(){
        Integer[] numere = {0,1,2,3,4,5,6,7,8,9,10};
        for (int numar: numere
             ) {
            out.println(numar);
        }
        assertEquals(0, numere[0]);
        assertEquals(10,numere[10]);

    }

    @Test
    public void arrays(){

        String[] x = new String[10];
        for (String numar: x
             ) {
            out.println(numar);
        }
    }

    @Test
    public void userNames(){

        User vlad = new User("Vlad", "1234");
        User andrei = new User("Andrei","123");
        User calin = new User("Calin", "1");

        User [] numeparole = {vlad, andrei, calin};
        for (User nume:numeparole
             ) {
            out.println(nume.password);
        }

    }

}
