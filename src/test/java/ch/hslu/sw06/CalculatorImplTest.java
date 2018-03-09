package ch.hslu.sw06;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {
    @Test
    public void addition() throws Exception {
        Calculator calc = new CalculatorImpl();
        assertEquals(11, calc.addition(5,6));
    }
    @Test
    public void additionZero() throws Exception {
        Calculator calc = new CalculatorImpl();
        assertEquals(0, calc.addition(0, 0));
    }

}