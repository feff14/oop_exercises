package ch.hslu.sw11;

import java.time.LocalDateTime;
import java.util.Objects;

public class Measurement implements Comparable<Measurement> {
    private Temperature temperature;
    private LocalDateTime dateTime;

    public Measurement(Temperature temp, LocalDateTime dateTime){
        this.temperature = temp;
        this.dateTime = dateTime;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Vergleicht Measurement auf Value-Gleichheit.
     */
    @Override
    public boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Temperature)) {
            return false;
        }
        final Measurement other = (Measurement) object;
        return Float.compare(other.temperature.getKelvin(), this.temperature.getKelvin()) == 0 && this.dateTime.equals(other.dateTime);
    }

    /**
     * Liefert den Hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(this.temperature.getKelvin() +this.dateTime.toString());
    }

    @Override
    public int compareTo(Measurement o) {
        return Float.compare(this.temperature.getKelvin(), o.temperature.getKelvin());
    }
}
