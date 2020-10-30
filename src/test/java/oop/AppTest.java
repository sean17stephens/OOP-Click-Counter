package oop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Count class.
 */
public class AppTest 
{
    /**
     * Test the click() method
     * It should increment the counter by one.
     */
    @Test
    public void click() {
        Counter counter = new Counter();
        counter.click();    // should increment by 1
        int expected = 1;
        int actual = counter.getCount();
        assertEquals(expected, actual);
    }

    //TODO add a test for Counter undo()

}
