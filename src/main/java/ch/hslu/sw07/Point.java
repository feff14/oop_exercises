package ch.hslu.sw07;

import java.util.Objects;

/**
 * Beschreiben Sie hier die Klasse Point.
 * 
 * @author Flavio Lazzarini
 * @version 1.0.0.0
 */
public class Point
{      
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int y;

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point()
    {
        // Instanzvariable initialisieren
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true;
        }
        if (!(obj instanceof Point)) {
            return false; }
        final Point other = (Point) obj;
        return (other.x == this.x) && (other.y == this.y);
    }

    public Point(int x, int y)
    {
        // Instanzvariable initialisieren
        this.setPoint(x,y);
    }

    public void setPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {

        return x;
    }
    
    public void setX(int x)
    {

        this.x = x;
    }
    
    public int getY()
    {

        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getQuadrant(final int x, final int y)
    {
        int quadrant = 0;
        if(y > 0)
        {
            if(x > 0)
            {
                quadrant = 1;
            }
            else if(x < 0)
            {
                quadrant = 2;
            }
        }
        else if(y < 0)
        {
            if(x > 0)
            {
                quadrant = 4;
            }
            else if(x < 0)
            {
                quadrant = 3;
            }
        }
        
        return quadrant;
    }

    public void moveRelative(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point){
        this.x += point.x;
        this.y += point.y;
    }
}
