/**
 * Stellt das Licht eines Fahrzeuges dar.
 *
 * @author Matej Mrnjec
 * @version 1.0.0.0
 */

package ch.hslu.sw10;

public class Klima implements Switchable
{
    /**
     * Repraesentiert den aktuellen switch Zustand
     */
    private int klimaStep = 0;

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Klima()
    {
        this.klimaStep = 0;
    }

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Klima(int klimaStep)
    {
        this.klimaStep = klimaStep;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn()
    {
        klimaStep = 1000;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff()
    {
        klimaStep = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn()
    {
        return klimaStep != 0 ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff()
    {
        return klimaStep == 0 ? true : false;
    }
}
