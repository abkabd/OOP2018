package Problem1.Interface;



public class Cylinder implements ShapesInterface {
    private double R;
    private double H;

    public Cylinder(double R, double H) {
        this.R = R;
        this.H = H;
    }

    @Override
    public double volume() {
        return ShapesInterface.PI*R*R*H;
    }

    @Override
    public double surfaceArea() {
        return 2* ShapesInterface.PI*R*(R+H);
    }
}
