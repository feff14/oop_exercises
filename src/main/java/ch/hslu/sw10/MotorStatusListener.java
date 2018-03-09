package ch.hslu.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@FunctionalInterface
public interface MotorStatusListener {
    public void listen(String motor, PropertyChangeEvent event);
}
