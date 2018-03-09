/**
 * Stellt ein Fahrzeug dar mit
 * - Radio
 * - Klima
 * - Motor
 * - Licht
 *
 * @author Matej Mrnjec
 * @version 1.0.0.0
 */

package ch.hslu.sw04;

public class Fahrzeug implements Switchable
{
    /**
     * Repraesentiert den aktuellen switch Zustand
     */
    private boolean state = false;
    private Motor motor = new Motor();
    private Radio radio = new Radio();
    private Klima klima = new Klima();
    private Licht licht = new Licht();

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Fahrzeug()
    {
        this.switchOff();
    }

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Fahrzeug(boolean state)
    {
        if(state)
        {
            this.switchOn();
        }
        else
        {
            this.switchOff();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn()
    {
        state = true;
        this.motor.switchOn();
        this.klima.switchOn();
        this.radio.switchOn();
        this.licht.switchOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff()
    {
        state = false;
        this.motor.switchOff();
        this.klima.switchOff();
        this.radio.switchOff();
        this.licht.switchOff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn()
    {
        return state == true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff()
    {
        return state == false;
    }
}
