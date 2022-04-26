package collections;
import org.junit.jupiter.api.Test;
import domainUser.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.*;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class Collections {

    @Test
    public void simpleCollectionExample(){
        String[] numbers0123Array = {"zero", "one", "two", "three"};
        List <String> numbers0123 = Arrays.asList(numbers0123Array);
        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123.get(0));
        assertEquals("three", numbers0123.get(3));
    }

    @Test
    public void simpleIntegerListExample(){

        Integer[] numereInt = {1,2,3,4,5,6};
        List<Integer> numere = Arrays.asList(numereInt);

        for (int numar:numere
             ) {
            out.println(numar);
        }

        assertEquals(1, numere.get(0));

    }

    @Test
    public void simpleDynamicCollectionExample(){
        List<String> numbers0123 = new ArrayList<String>();
        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");
//        numbers0123.remove(3);
        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
//        out.println(numbers0123.size());
//        assertEquals("zero", numbers0123.get(0));
//        assertEquals("three", numbers0123.get(3));
    }

    @Test
    public void zileSapmana(){

        String [] catevazile = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};

        List<String> zile = Arrays.asList(catevazile);

        /*FOR EACH
        int rezultat = 0;
        for(String zi : zile){
            if(zi.equals("Monday")){
                rezultat = zile.indexOf("Monday");
                break;
            }

        }
        assertEquals(3, rezultat);
        */

        /* FOR
        int i;
        for (i=0; i<=zile.size(); i++){

            if(Objects.equals(zile.get(i), "Monday")){
                break;
            }

        }
        assertEquals(3, i);
        */

        //WHILE
        int i = 0;
        while(!Objects.equals(zile.get(i), "Monday")){
            i++;
        }
        out.println(i);
        assertEquals(3, i);

        /* DO WHILE
        int docount=-1;
        do{
        docount++;
        }while(!days.get(docount).equals("Monday"));
        assertEquals("Monday is at position 3", 3, docount);
         */
    }

}
