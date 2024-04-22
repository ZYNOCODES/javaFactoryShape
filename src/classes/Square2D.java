package classes;

import interfaces.Square;

public class Square2D implements Square {
    private double side;
    public Square2D(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}
