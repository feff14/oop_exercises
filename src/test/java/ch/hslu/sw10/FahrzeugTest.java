package ch.hslu.sw10;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrzeugTest {
    @Test
    public void switchOn() throws Exception {
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.switchOn();
        assertEquals(true, fahrzeug.isSwitchedOn());
    }

    @Test
    public void switchOff() throws Exception {
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.switchOff();
        assertEquals(true, fahrzeug.isSwitchedOff());
    }

    @Test
    public void MotorEvent() throws Exception{
        Fahrzeug f = new Fahrzeug(true);
        f.switchOff();
        f.switchOn();
    }

}