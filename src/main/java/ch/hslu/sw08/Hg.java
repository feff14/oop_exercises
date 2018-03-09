package ch.hslu.sw08;


/**
 * Write a description of class Hg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hg extends Element
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Hg
     */
    public Hg()
    {
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "HG";
    }

    public Hg(float temp)
    {
        super(temp);
        super.liquidTemp = 234.32f;
        super.vaporTemp = 630.2f;
        super.name = "HG";
    }
}
