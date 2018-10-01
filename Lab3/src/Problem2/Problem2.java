package Problem2;

public class Problem2 {
    public static void main(String args[]) {
        Cylinder cl = new Cylinder(5, 10);
        Sphere sp = new Sphere(10);
        Cube cb = new Cube(7);

        System.out.println(cl.getInfo());
        System.out.println(sp.getInfo());
        System.out.println(cb.getInfo());
    }
}
