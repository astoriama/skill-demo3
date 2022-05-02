import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    //test addition method
    @Test
    public void addition() {
        assertEquals(3, skillDemo.add(1,2));//failing
    }

}
