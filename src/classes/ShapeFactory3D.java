package classes;

import interfaces.Circle;
import interfaces.ShapeFactory;
import interfaces.Square;
import interfaces.Triangle;

public class ShapeFactory3D implements ShapeFactory {
    @Override
    public Circle createCircle(double area) {
        return new Circle3D(area);
    }

    @Override
    public Square createSquare(double side) {
        return new Square3D(side);
    }

    @Override
    public Triangle createTriangle(double base, double height) {
        return null;
    }

    @Override
    public Triangle createTriangle3D(double baseArea, double perimeter, double slantHeight) {
        return new Triangle3D(baseArea, perimeter, slantHeight);
    }
}
