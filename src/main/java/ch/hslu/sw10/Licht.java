/**
 * Stellt das Licht eines Fahrzeuges dar.
 *
 * @author Matej Mrnjec
 * @version 1.0.0.0
 */

package ch.hslu.sw10;

public class Licht implements Switchable
{
    /**
     * Repraesentiert den aktuellen switch Zustand
     */
    private int lume = 0;

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Licht()
    {
        this.lume = 0;
    }

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Licht(int lume)
    {
        this.lume = lume;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn()
    {
        lume = 1000;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff()
    {
        lume = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn()
    {
        return lume != 0 ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff()
    {
        return lume == 0 ? true : false;
    }
}
