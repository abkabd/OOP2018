package Problem1.Abstact_Class;

public class Cube extends ShapesClass {
    private double X;

    public Cube(double X) {
        this.X = X;
    }

    @Override
    public double volume() {
        return X*X*X;
    }

    @Override
    public double surfaceArea() {
        return 6*X*X;
    }

}
