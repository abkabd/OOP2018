package Problem2;

public class Cylinder extends Shapes {
    private double R;
    private double H;

    Cylinder(double R, double H) {
        this.R = R;
        this.H = H;
    }

    public double volume() {
        return PI*R*R*H;
    }

    public double surfaceArea() {
        return 2*PI*R*(R+H);
    }

    public String getInfo() {
        return String.format("Volume: %f \nSurface area: %f\n", volume(), surfaceArea());
    }
}
