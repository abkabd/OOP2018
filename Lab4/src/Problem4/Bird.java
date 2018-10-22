package Problem4;

import Problem2.Barkable;

public class Bird extends Animal implements Flyable {
    private int z;

    public Bird(int x0, int y0, int z0) {
        super(x0, y0);
        z = z0;
    }

    @Override
    public void flyTo(int x, int y, int z) {
        super.moveTo(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("z = %d\n", z);
    }
}
