/**
 * Stellt einen Motor eines Fahrzeuges dar.
 *
 * @author Matej Mrnjec
 * @version 1.0.0.0
 */

package ch.hslu.sw04;

public class Motor implements Switchable
{
    /**
     * Repraesentiert den aktuellen switch Zustand
     */
    private int rpm = 0;

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Motor()
    {
        this.rpm = 0;
    }

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Motor(int rpm)
    {
        this.rpm = rpm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn()
    {
        rpm = 1000;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff()
    {
        rpm = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn()
    {
        return rpm != 0 ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff()
    {
        return rpm == 0 ? true : false;
    }
}
