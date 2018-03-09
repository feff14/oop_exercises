package ch.hslu.sw10;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TemperatureHistory {
    private Collection<Temperature> temperatures = new ArrayList<>();

    public void addTemperature(Temperature temp) {
        temperatures.add(temp);
    }

    private void clear(){
        temperatures.clear();
    }

    public int getCount(){
        return  temperatures.size();
    }
    public float max()
    {
        if(temperatures.size() > 0) {
            return Collections.max(temperatures).getTemperaturKelvin();
        }
        else {
            return 0;
        }
    }

    public float min()
    {
        if(temperatures.size() > 0) {
            return Collections.min(temperatures).getTemperaturKelvin();
        }
        else {
            return 0;
        }
    }

    public float averageTemperature(){
        if(temperatures.size() > 0) {
            Iterator<Temperature> iterator = temperatures.iterator();
            float sum = 0;
            while (iterator.hasNext()) {
                final Temperature temp = iterator.next();
                sum += temp.getTemperaturKelvin();
            }
            return sum / temperatures.size();
        }
        else {
            return 0;
        }
    }
}
