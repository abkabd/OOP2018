package Problem2;

public class Cube extends Shapes {
    private double X;

    Cube(double X) {
        this.X = X;
    }

    public double volume() {
        return X*X*X;
    }

    public double surfaceArea() {
        return 6*X*X;
    }

    public String getInfo() {
        return String.format("Volume: %f \nSurface area: %f\n", volume(), surfaceArea());
    }
}
