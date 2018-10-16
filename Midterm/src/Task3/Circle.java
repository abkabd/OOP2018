package Task3;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.radius = 0.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public String toString() {
        return String.format("Color: %s\nFilled: %b\nPerimeter: %.3f\nArea: %.3f\n",
                super.getColor(), super.isFilled(), getPerimeter(), getArea());
    }
}
