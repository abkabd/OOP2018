package Problem1.Interface;



public class Cube implements ShapesInterface {
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
