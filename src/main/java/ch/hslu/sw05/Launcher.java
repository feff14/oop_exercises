package ch.hslu.sw05;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Launcher {

    private static final Logger LOGGER = LogManager.getLogger(Launcher.class);

    public static void main(final String[] args) {
        Rectangle rect = new Rectangle(4, 5, 5 ,6);
        double area = rect.getArea();
        LOGGER.info("The area of the rectangle is " + area);
        Circle circle = new Circle(5, 6, 6);
        double circlePerimeter = circle.getPerimeter();
        LOGGER.info("the perimeter of the circle is "+ circlePerimeter);
    }
}