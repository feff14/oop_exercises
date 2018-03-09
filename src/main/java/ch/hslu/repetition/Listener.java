package ch.hslu.repetition;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class Listener {
    private Rep r = new Rep();

    public Listener(){
        r.addPropertyChangeListener(evt->handle(evt));
    }

    private void handle(PropertyChangeEvent evt){
        //doSomething();
    }
}
