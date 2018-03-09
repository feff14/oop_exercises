package ch.hslu.sw11;



import java.util.*;

public class MeasurementHistory {
    private Collection<Measurement> measurements = new ArrayList<>();

    public void addMeasurement(Measurement measurement) {
        measurements.add(measurement);
    }

    private void clear(){
        measurements.clear();
    }

    public int getCount(){
        return  measurements.size();
    }
    public Measurement max()
    {
        if(measurements.size() > 0) {
            return Collections.max(measurements);
        }
        else {
            return null;
        }
    }

    public Measurement min()
    {
        if(measurements.size() > 0) {
            return Collections.min(measurements);
        }
        else {
            return null;
        }
    }

    public float averageTemperature(){
        if(measurements.size() > 0) {
            Iterator<Measurement> iterator = measurements.iterator();
            float sum = 0;
            while (iterator.hasNext()) {
                final Measurement measurement = iterator.next();
                sum += measurement.getTemperature().getKelvin();
            }
            return sum / measurements.size();
        }
        else {
            return 0;
        }
    }

    public float averageTemperatureCelsius(){
        if(measurements.size() > 0) {
            Iterator<Measurement> iterator = measurements.iterator();
            float sum = 0;
            while (iterator.hasNext()) {
                final Measurement measurement = iterator.next();
                sum += measurement.getTemperature().getCelsius();
            }
            return sum / measurements.size();
        }
        else {
            return 0;
        }
    }
}
