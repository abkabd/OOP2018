package Problem1.Interface;


public class Sphere implements ShapesInterface {
    private double R;

    public Sphere(double R) {
        this.R = R;
    }

    @Override
    public double volume() {
        return 4/3* ShapesInterface.PI*R*R*R;
    }

    @Override
    public double surfaceArea() {
        return 4* ShapesInterface.PI*R*R;
    }

}
