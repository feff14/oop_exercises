package ch.hslu.sw06;

/**
 * Write a description of class Line here.
 *
 * @author Flavio Lazzarini
 * @version 1.0
 */
public class Line
{
    // instance variables - replace the example below with your own
    private Point startPoint;
    private Point endPoint;

    /**
     * Constructor for objects of class Line
     */
    public Line(int x1, int y1, int x2, int y2)
    {
        startPoint = new Point(x1,y1);
        endPoint = new Point(x2,y2);
    }

    public Line(Point startPoint, Point endPoint)
    {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint()
    {
        return this.startPoint;
    }

    public void setStartPoint(int x, int y)
    {
        this.startPoint.setPoint(x,y);
    }

    public void setStartPoint(Point startPoint)
    {
        this.startPoint = startPoint;
    }

    public Point getEndPoint()
    {
        return this.endPoint;
    }
    
    public void setEndPoint(int x, int y)
    {
        this.endPoint.setPoint(x,y);
    }
    
    public void setEndPoint(Point endPoint)
    {
        this.endPoint = endPoint;
    }


}
