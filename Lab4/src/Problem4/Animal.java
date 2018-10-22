package Problem4;

public class Animal implements Movable {
    private int x;
    private int y;

    public Animal(int x0, int y0) {
        x = x0;
        y = y0;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Coordinates:\nx = %d\ny = %d\n", x, y);
    }
}
