package ch.hslu.sw08;

public class Rectangle extends Shape {
    private int width;
    private int height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }
    @Override
    public double getArea()
    {
        return width * height;
    }
}
