import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    /**
     * Test hashString() with none empty value.
     */
    @Test
    public void testHashStringWithNoneEmpty() {
        /*
        Initialize
         */
        int num1 = Main.hashString("00150");
        int num1Expected = 2;
        assertEquals(num1Expected, num1);
    }

    /**
     * Test hashString() with empty value.
     */
    @Test
    public void testHashStringWithEmpty() {
        /*
        Initialize
         */
        int num1 = Main.hashString("");
        int num1Expected = 0;
        assertEquals(num1Expected, num1);
    }
    //TODO Haven't done yet
}
