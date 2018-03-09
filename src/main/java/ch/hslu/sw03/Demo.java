package ch.hslu.sw03;

/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{
     /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int max(final int a, final int b, final int c)
    {
        if(a >= b && a >= c)
        {
            return a;
        }
        else if (b>=a && b>=c)
        {
            return b;
        }
        else 
        {
            return c;
        }
    }
    
    public int min(final int a, final int b, final int c)
    {
        if(a <= b && a <= c)
        {
            return a;
        }
        else if (b <= a && b <= c)
        {
            return b;
        }
        else 
        {
            return c;
        }
    }
}