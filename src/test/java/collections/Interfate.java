package collections;
import org.junit.jupiter.api.Test;
import domainUser.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.*;
import domainUser.*;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class Interfate {


    //COLLECTION

    @Test
    public void collections(){

        Collection<String> weekendDays = new <String>ArrayList();
        Collection<String> daysOfWeek = new <String>ArrayList();

        weekendDays.add("Luni");
        weekendDays.add("Marti");
        weekendDays.add("Miercuri");
        daysOfWeek.addAll(weekendDays);
//        String[] days = daysOfWeek.toArray(new String[3]);
//        out.println(days[0]);
        assertEquals(3, weekendDays.size());

    }

    @Test
    public void exercitiuColectie(){

        Collection users = new ArrayList();

        assertEquals(0, users.size());
        assertTrue(users.isEmpty());

        User vlad = new User("vlad", "1234");
        User andrei = new User("andrei", "123456");
        users.add(vlad);
        users.add(andrei);

        assertEquals(2, users.size());
        assertTrue(!users.isEmpty());

        Collection newusers = new ArrayList();
        User calin = new User("calin", "0000");

        newusers.addAll(users);
        assertTrue(newusers.contains(vlad));


    }

    // LIST

    @Test
    public void lista(){


        List<String> zile = new ArrayList <String>();
        zile.add("Luni");
        zile.add("Marti");
        zile.add(1,"Miercuri");
        out.println(zile.size());
        out.println(zile.indexOf("Miercuri"));
//        assertEquals(3, zile.indexOf("Thursday"));

    }

    @Test
    public void exercitiuLista(){

        List<User> useri = new ArrayList <User>();
        User vlad = new User("vlad", "1234");
        User andrei = new User("andrei", "123456");
        User calin = new User("calin", "0000");

        useri.add(vlad);
        useri.add(0, andrei);

        assertEquals(0, useri.indexOf(andrei));
        assertEquals(1, useri.indexOf(vlad));

    }


    /// SET

    @Test
    public void set(){

        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        assertEquals(1, workdays.size());
        // can only have 1 element as Monday

    }

    /// MAP

    @Test
    public void map(){

        Map<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(3, map.size());
        assertEquals("value1", map.get("key1"));
        assertTrue(map.containsKey("key2"));

        Collection<String> valori = map.values();
        String[] sir = new String[3];
        valori.toArray(sir);
        out.println(sir[1]);


    }
}
