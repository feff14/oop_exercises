package ch.hslu.sw06;


/**
 * Abstract class Element - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Element
{
    protected float liquidTemp;
    protected float vaporTemp;
    protected String name;
    // instance variables - replace the example below with your own

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public String getAggregateState(float actualTemp)
    {
        if(actualTemp >= this.liquidTemp){
            return "flüssig";
        }
        else if(actualTemp>= vaporTemp)
        {
            return "gasförmig";
        }
        else
        {
            return "fest";
        }
    }
    @Override
    public String toString(){
        return "";
    }
}

