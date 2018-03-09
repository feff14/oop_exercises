package ch.hslu.sw08;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {
    @Test
    public void convertTemperaturKelvinToCelsius() throws Exception {

        assertEquals(0f, Temperature.convertTemperaturKelvinToCelsius(273.15f), 0);
    }

}