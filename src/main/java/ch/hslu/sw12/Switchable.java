/**
 * Dieses Interface stellt einen einfachen Schalter dar.
 *
 * @author Matej Mrnjec
 * @version 1.0.0.0
 */

package ch.hslu.sw12;

public interface Switchable
{
    /**
     * Stellt den Schalter auf ON
     */
    void switchOn();

    /**
     * Stellt den Schalter auf OFF
     */
    void switchOff();

    /**
     * Prüft ob Schalter auf ON ist
     *
     * @return Falls Schalter = ON, dann true sonst false
     */
    boolean isSwitchedOn();

    /**
     * Prüft ob Schalter auf OFF ist
     *
     * @return Falls Schalter = OFF, dann true sonst false
     */
    boolean isSwitchedOff();
}