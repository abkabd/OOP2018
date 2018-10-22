package Problem1.Interface;



public class Point implements ShapesInterface {
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
