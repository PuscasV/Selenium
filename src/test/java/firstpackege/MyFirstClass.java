package firstpackege;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyFirstClass {

    @Test
    public void canAddTwoNumbers(){

        int answer= 2+2;
        String message = "2+2=4";
        assertEquals( 5, answer, "2+2=4");

    }

}
