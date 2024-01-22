package Figures;

public final class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle (int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return (this.sideA * 2) + (this.sideB * 2);
    }

    @Override
    public double getSqare() {
        return this.sideA * this.sideB;
    }
}
