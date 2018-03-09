package ch.hslu.sw08;


/**
 * Write a description of class Pb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pb extends Element
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Pb
     */
    public Pb()
    {
        // initialise instance variables
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "PB";
    }
    public Pb(float temp)
    {
        super(temp);
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "PB";
    }
}
