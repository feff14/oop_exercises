package ch.hslu.sw06;


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
    }
    @Override
    public String toString()
    {
        return super.toString()+"GIFTIG";
    }
}
