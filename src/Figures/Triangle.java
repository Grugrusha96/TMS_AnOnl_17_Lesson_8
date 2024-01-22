package Figures;

public final class Triangle extends Figure {
    private final int sideA;
    private  final int sideB;
    private  final int sideC;

    public Triangle (int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double getSqare() {
        int demiRadiys = (this.sideA + this.sideB + this.sideC) / 2;
        double result = Math.sqrt(demiRadiys * (demiRadiys - this.sideA) * (demiRadiys - this.sideB) * (demiRadiys - this.sideC));
        return result;
    }
}
