package ch.hslu.sw08;


import ch.hslu.sw07.Temperatur;

import java.util.Objects;

/**
 * Abstract class Element - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Element
{
    public enum AggregatState {
        LIQUID("flüssig"), SOLID("fest"),
        GAS("gasförmig");
        private String germanName;

        AggregatState(String german) {
            this.germanName = german;
        }

        public String getGermanName() {
            return germanName;
        }

    }
    protected float liquidTemp;
    protected float vaporTemp;
    protected String name;
    protected Temperature temp;
    // instance variables - replace the example below with your own

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public Element(float temp)
    {
        this.temp = new Temperature(temp);
    }

    public Element()
    {
        this.temp = new Temperature(0f);
    }

    public float getCurrentTemperature()
    {
        return temp.getTemperaturKelvin();
    }

    public float getCurrentTemperatureCelsius()
    {
        return temp.getTemperaturCelsius();
    }

    public float getCurrentTemperatureFarenheit()
    {
        return temp.getTemperaturFahrenheit();
    }

    public void setCurrentTemperature(float currentTemp)
    {
        temp.setTemperaturKelvin(currentTemp);
    }

    public AggregatState getAggregateState(float actualTemp)
    {
        if(actualTemp>= vaporTemp)
        {
            return AggregatState.GAS;
        }
        else if(actualTemp >= this.liquidTemp){
            return AggregatState.LIQUID;
        }
        else
        {
            return AggregatState.SOLID;
        }
    }
    @Override
    public String toString(){
        return this.name + " ist bei " + temp.getTemperaturKelvin() + " °C " + this.getAggregateState(temp.getTemperaturKelvin()).germanName;
    }

    @Override
    public final boolean equals(Object obj) {
        if(obj == this)
        {
            return true;
        }
        if(!(obj instanceof Element))
        {
            return false;
        }
        final Element other = (Element)obj;
        return Objects.equals(other.name, this.name) && Objects.equals(other.temp, this.temp);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.temp.getTemperaturKelvin(), this.name);
    }
}

