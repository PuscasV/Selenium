package collections;
import org.junit.jupiter.api.Test;
import domainUser.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.*;
import domainUser.*;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class Interfate {

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

}
