package ch.hslu.sw08;

public class Circle extends Shape {
    private double radius;

    /**
     * Constructor for objects of class Circle
     * @param newX the x position of the shape
     * @param newY the y position of the shape
     * @param radius the radius of the circle
     */
    public Circle(int newX, int newY, double radius)
    {
        super(newX, newY);
        this.radius = radius;

    }

    /**
     * An example of a method - replace this comment with your own
     * @return    the perimeter of the Circle
     */
    @Override
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    /**
     *
     * @return the area of the Circle
     */
    @Override
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }
}
