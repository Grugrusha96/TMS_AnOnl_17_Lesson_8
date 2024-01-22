package Figures;

public final class Circle extends Figure {
    private final int radius;

    public Circle (int radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public double getSqare() {
        return Math.PI * this.radius * this.radius;
    }
}