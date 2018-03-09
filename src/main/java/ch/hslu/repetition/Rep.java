package ch.hslu.repetition;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rep {

    List<String> list = new ArrayList<>();
    Iterator<String> iterator = list.iterator();
    boolean status = true;
    private List<PropertyChangeListener> listeners = new ArrayList<>();

    public void addPropertyChangeListener(PropertyChangeListener listener){
        listeners.add(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        listeners.remove(listener);
    }

    public void informListener(){
        for(PropertyChangeListener listener: listeners){
            listener.propertyChange(new PropertyChangeEvent(this, "motor", true, false));
        }
    }

    public void test(){
        while(iterator.hasNext()){
            final String test = iterator.next();

        }
        for(final String test : list){

        }
    }
}
