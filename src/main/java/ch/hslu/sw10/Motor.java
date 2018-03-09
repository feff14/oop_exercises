/**
 * Stellt einen Motor eines Fahrzeuges dar.
 *
 * @author Matej Mrnjec
 * @version 1.0.0.0
 */

package ch.hslu.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {
    /**
     * Repraesentiert den aktuellen switch Zustand
     */
    private int rpm = 0;
    private State state = State.OFF;
    private final List<PropertyChangeListener> changeListeners = new ArrayList<PropertyChangeListener>();

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Motor() {
        this.rpm = 0;
    }

    /**
     * Konstruktor, setzt aktuellen switch Zustand auf false
     */
    public Motor(int rpm) {
        this.rpm = rpm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn() {
        if (isSwitchedOff()) {
            this.state = State.ON;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(
                    this, "state", State.OFF, State.ON);
            this.firePropertyChangeEvent(pcEvent);
        }
        rpm = 1000;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff() {
        rpm = 0;
        this.state = State.OFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn() {
        return rpm != 0 ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff() {
        return rpm == 0 ? true : false && state == state.OFF;
    }

    private void firePropertyChangeEvent(
            final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }

    /**
     * Registriert einen PropertyChangeListener.
     *
     * @param listener PropertyChangeListener.
     */
    public void addPropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }

    /**
     * Deregistriert einen PropertyChangeListener.
     *
     * @param listener PropertyChangeListener.
     */
    public void removePropertyChangeListener(
            final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }
}
