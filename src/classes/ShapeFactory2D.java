package classes;

import interfaces.Circle;
import interfaces.ShapeFactory;
import interfaces.Square;
import interfaces.Triangle;

public class ShapeFactory2D implements ShapeFactory {
    @Override
    public Circle createCircle(double radius) {
        return new Circle2D(radius);
    }

    @Override
    public Square createSquare(double side) {
        return new Square2D(side);
    }

    @Override
    public Triangle createTriangle(double base, double height) {
        return new Triangle2D(base, height);
    }

    @Override
    public Triangle createTriangle3D(double baseArea, double perimeter, double slantHeight) {
        return null;
    }
}
