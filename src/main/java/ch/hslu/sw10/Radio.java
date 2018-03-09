/**
 * Stellt das Radio eines Fahrzeuges dar.
 *
 * @author Flavio Lazzarini
 * @version 1.0.0.0
 */

package ch.hslu.sw10;

public class Radio implements Switchable
{
    /**
     * Repraesentiert den aktuellen switch Zustand
     */
    private int volume = 0;

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Radio()
    {
        this.volume = 0;
    }

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Radio(int volume)
    {
        this.volume = volume;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn()
    {
        volume = 100;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff()
    {
        volume = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn()
    {
        return volume != 0 ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff()
    {
        return volume == 0 ? true : false;
    }
}
