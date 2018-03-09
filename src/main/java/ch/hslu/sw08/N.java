package ch.hslu.sw08;

/**
 * Write a description of class N here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class N extends Element
{
    /**
     * Constructor for objects of class N
     */
    public N()
    {
        // initialise instance variables
        super.liquidTemp = 63.05f;
        super.vaporTemp = 77.15f;
        super.name = "N";
    }

    public N(float temp)
    {
        super(temp);
        // initialise instance variables
        super.liquidTemp = 63.05f;
        super.vaporTemp = 77.15f;
        super.name = "N";
    }

}
