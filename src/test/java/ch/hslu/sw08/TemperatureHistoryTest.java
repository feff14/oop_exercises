package ch.hslu.sw08;

import ch.hslu.sw07.Temperatur;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureHistoryTest {
    @Test
    public void min() throws Exception {
        TemperatureHistory history = new TemperatureHistory();
        assertEquals(0, history.max(),0);
    }

    @Test
    public void max() throws Exception {
        Temperature temp1 = new Temperature(50.f);
        Temperature temp2 = new Temperature(40.f);
        Temperature temp3 = new Temperature(30.f);

        TemperatureHistory history = new TemperatureHistory();
        history.addTemperature(temp1);
        history.addTemperature(temp2);
        history.addTemperature(temp3);
        assertEquals(50f, history.max(), 0);
    }

    @Test
    public void averageTemperature() throws Exception {
        Temperature temp1 = new Temperature(50.f);
        Temperature temp2 = new Temperature(40.f);
        Temperature temp3 = new Temperature(30.f);

        TemperatureHistory history = new TemperatureHistory();
        history.addTemperature(temp1);
        history.addTemperature(temp2);
        history.addTemperature(temp3);
        assertEquals(40f, history.averageTemperature(), 2);
    }

}