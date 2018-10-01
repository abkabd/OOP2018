package Problem2;

public class Sphere extends Shapes {
    private double R;

    Sphere(double R) {
        this.R = R;
    }

    public double volume() {
        return 4/3*PI*R*R*R;
    }

    public double surfaceArea() {
        return 4*PI*R*R;
    }

    public String getInfo() {
        return String.format("Volume: %f \nSurface area: %f\n", volume(), surfaceArea());
    }
}
