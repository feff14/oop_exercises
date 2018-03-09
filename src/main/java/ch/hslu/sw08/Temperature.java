package ch.hslu.sw08;


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
    // instance variables - replace the example below with your own
    private float temperaturKelvin;

    //<editor-fold desc="Const">
    public Temperature()
    {

        this.temperaturKelvin = 0.0f;
    }

    public Temperature(Temperature tmp){
        this(tmp.temperaturKelvin);
    }

    public Temperature(float tempK)
    {

        this.temperaturKelvin = tempK;
    }
    //</editor-fold>

    //<editor-fold desc="Setter">
    public void setTemperaturCelsius(float temperaturCelsius) {
        this.temperaturKelvin = convertTemperaturCelsiusToKelvin(temperaturCelsius);
    }

    public void setTemperaturKelvin(float temperaturKelvin) {
        this.temperaturKelvin = temperaturKelvin;
    }

    public void setTemperaturFahrenheit(float temperaturFahrenheit) {
        this.temperaturKelvin = convertTemperaturFahrenheitToKelvin(temperaturFahrenheit);
    }
    //</editor-fold>

    //<editor-fold desc="Getter">

    public float getTemperaturCelsius() {
        return convertTemperaturKelvinToCelsius(this.temperaturKelvin);
    }

    public float getTemperaturKelvin() {
        return this.temperaturKelvin;
    }

    public float getTemperaturFahrenheit() {
        return convertTemperaturKelvinToFahrenheit(this.temperaturKelvin);
    }
    //</editor-fold>

    //<editor-fold desc="Convert">

    public static float convertTemperaturKelvinToCelsius(float temperaturKelvin) {
        float temperaturCelsius;
        temperaturCelsius = temperaturKelvin - KELVIN_OFFSET;
        return temperaturCelsius;
    }

    public static float convertTemperaturKelvinToFahrenheit(float temperaturKelvin) {
        float temperaturFahrenheit;
        temperaturFahrenheit = (temperaturKelvin * 1.8f) - 459.67f;
        return temperaturFahrenheit;
    }

    public static float convertTemperaturFahrenheitToKelvin(float temperaturFahrenheit) {
        float temperaturKelvin = (temperaturFahrenheit + 459.67f) * (5 / 9f);
        return temperaturKelvin;
    }

    public static float convertTemperaturCelsiusToKelvin(float temperaturCelsius) {
        float temperaturKelvin = temperaturCelsius + KELVIN_OFFSET;
        return temperaturKelvin;
    }
    //</editor-fold>

    //<editor-fold desc="Adder">
    public void addKelvin(float tmpKelvin)
    {
        if(this.temperaturKelvin + tmpKelvin >= 0.0f || this.temperaturKelvin + tmpKelvin <= 500.0f)
        {
            this.temperaturKelvin += tmpKelvin;
        }
    }

    public void addFahrenheit(float tmpFahrenheit)
    {
        float tmpF = getTemperaturFahrenheit();
        tmpF += tmpFahrenheit;
        float tmpK = (tmpFahrenheit + 459.67f) * (5.0f/9.0f);
        this.temperaturKelvin =tmpK;
    }

    public void addCelsius(float tmpCelsius)
    {
        float tmpC = this.getTemperaturCelsius();
        tmpC += tmpCelsius;
        float tmpK = tmpC + 273.15f;
        this.temperaturKelvin = tmpK;
    }

    //</editor-fold>

    //<editor-fold desc="Override">

    @Override
    public int hashCode() {
        return Objects.hash(this.temperaturKelvin);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Temperature)) {
            return false;
        }
        final Temperature other = (Temperature) obj;
        return (Float.compare(other.temperaturKelvin, this.temperaturKelvin)==0);
    }
    @Override
    public int compareTo(Temperature other)
    {
        return Float.compare(this.temperaturKelvin, other.temperaturKelvin);
    }
    //</editor-fold>
}
