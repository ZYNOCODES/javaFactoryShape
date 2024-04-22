package classes;

import interfaces.Circle;

public class Circle2D implements Circle {
    private double radius;

    public Circle2D(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
