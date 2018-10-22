package Problem1.Abstact_Class;

public class Sphere extends ShapesClass {
    private double R;

    public Sphere(double R) {
        this.R = R;
    }

    @Override
    public double volume() {
        return 4/3*PI*R*R*R;
    }

    @Override
    public double surfaceArea() {
        return 4*PI*R*R;
    }

}
