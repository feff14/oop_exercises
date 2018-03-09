package ch.hslu.sw03;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void max() throws Exception {
        Demo demo = new Demo();
        int returnValue = demo.max(5, 6, 3);
        assertEquals(6, returnValue);
    }
    @Test
    public void maxTwoEqualValues() throws Exception {
        Demo demo = new Demo();
        int returnValue = demo.max(5, 5, 3);
        assertEquals(5, returnValue);
    }
    @Test
    public void maxMNegativeValues() throws Exception {
        Demo demo = new Demo();
        int returnValue = demo.max(-5, 6, 3);
        assertEquals(6, returnValue);
    }

}