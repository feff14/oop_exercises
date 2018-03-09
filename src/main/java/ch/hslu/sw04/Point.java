package ch.hslu.sw04;
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

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point()
    {
        // Instanzvariable initialisieren
        x = 0;
        y = 0;
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
}
