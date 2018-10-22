package Problem1.Abstact_Class;

public class Cylinder extends ShapesClass {
    private double R;
    private double H;

    public Cylinder(double R, double H) {
        this.R = R;
        this.H = H;
    }

    @Override
    public double volume() {
        return PI*R*R*H;
    }

    @Override
    public double surfaceArea() {
        return 2*PI*R*(R+H);
    }
}
