package ch.hslu.sw06;

public abstract class Shape {

    private int x;
    private int y;

    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }

    public final int getX()
    {
        return this.x;
    }

    public final int getY()
    {
        return this.y;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
}
