package Problem1;

import Problem1.Interface.*;

public class Problem1 {
    public static void main(String [] args) {
        Cylinder cylinder = new Cylinder(4,5);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(4);
        Point point = new Point(2, 5);

        System.out.println(cylinder.volume() + " " + cylinder.surfaceArea());
        System.out.println(sphere.volume() + " " + sphere.surfaceArea());
        System.out.println(cube.volume() + " " + cube.surfaceArea());
        System.out.println(point.volume() + " " + point.surfaceArea());
    }
}
