package ch.hslu.sw11;


import java.util.Objects;

/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature implements Comparable<Temperature>
{
    private static final float KELVIN_OFFSET = 273.15f;
    private static final float MIN_KELVIN = 0.0f;
    private static final float MIN_CELSIUS = MIN_KELVIN - KELVIN_OFFSET;

    private final float kelvin;

    /**
     * Privater Konstruktor mit Temperature in Kelvin.
     * @param kelvin Temperature in Kelvin.
     */
    private Temperature(final float kelvin) {
        this.kelvin = kelvin;
    }

    /**
     * Copy-Konstruktor.
     * @param temperature Temperature-Objekt.
     * @throws java.lang.NullPointerException bei ungültigem Temperaturobjekt.
     */
    public Temperature(final Temperature temperature) {
        this(temperature.kelvin);
    }

    /**
     * Liefert die Temperature in Kelvin.
     * @return Temperature in Kelvin.
     */
    public float getKelvin() {
        return this.kelvin;
    }

    /**
     * Liefert die Temperature in Celsius.
     * @return Temperature in Celsius
     */
    public float getCelsius() {
        return convertKelvinToCelsius(this.kelvin);
    }

    /**
     * Vergleicht Temperature auf Value-Gleichheit.
     */
    @Override
    public boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Temperature)) {
            return false;
        }
        final Temperature other = (Temperature) object;
        return Float.compare(other.kelvin, this.kelvin) == 0;
    }

    /**
     * Liefert den Hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.kelvin));
    }

    /**
     * Liefert eine einfache String-Repräsentation des Objektes.
     */
    @Override
    public String toString() {
        return String.format("Temperature[kelvin=%.1f;celsius=%.1f]", this.getKelvin(), this.getCelsius());
    }

    /**
     * Vergleicht Temperature nach dem Wert.
     */
    @Override
    public int compareTo(final Temperature other) {
        return Float.compare(this.kelvin, other.kelvin);
    }

    /**
     * Factorymethode für Temperature mit Initialwert in Kelvin.
     * @param kelvin Tempertur in Kelvin.
     * @return Temperaturobjekt.
     * @throws java.lang.IllegalArgumentException bei ungültigem Temperaturwert.
     */
    public static Temperature createFromKelvin(final float kelvin) {
        if (kelvin >= MIN_KELVIN) {
            return new Temperature(kelvin);
        }
        throw new IllegalArgumentException("Ungültiger Wert für Temperature in Kelvin: " + kelvin);
    }

    /**
     * Factorymethode für Temperature mit Initialwert in Celsius.
     * @param celsius Tempertur in Celsius.
     * @return Temperaturobjekt.
     * @throws java.lang.IllegalArgumentException bei ungültigem Temperaturwert.
     */
    public static Temperature createFromCelsius(final float celsius) {
        return createFromKelvin(convertCelsiusToKelvin(celsius));
    }

    /**
     * Konvertiert einen Wert in Kelvin nach Celsius.
     * @param kelvin Temperature in Kelvin.
     * @return Temperature in Celsius.
     * @throws java.lang.IllegalArgumentException bei ungültigem Temperaturwert.
     */
    public static float convertKelvinToCelsius(final float kelvin) {
        if (kelvin >= MIN_KELVIN) {
            return kelvin - KELVIN_OFFSET;
        }
        throw new IllegalArgumentException("Ungültiger Wert für Temperature in Kelvin: " + kelvin);
    }

    /**
     * Konvertiert einen Wert in Celsius nach Kelvin.
     * @param celsius Temperature in Celsius.
     * @return Temperature in Kelvin.
     * @throws java.lang.IllegalArgumentException bei ungültigem Temperaturwert.
     */
    public static float convertCelsiusToKelvin(final float celsius) {
        if (celsius >= MIN_CELSIUS) {
            return (celsius + KELVIN_OFFSET);
        }
        throw new IllegalArgumentException("Ungültiger Wert für Temperature in Celsius: " + celsius);
    }
}
