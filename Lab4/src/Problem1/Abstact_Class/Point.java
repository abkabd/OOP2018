package Problem1.Abstact_Class;

public class Point extends ShapesClass {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double surfaceArea() {
        return 0;
    }
}
