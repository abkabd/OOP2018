package Task3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width = 0.0;
        length = 0.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString() {
        return String.format("Color: %s\nFilled: %b\nPerimeter: %.3f\nArea: %.3f\n",
                super.getColor(), super.isFilled(), getPerimeter(), getArea());
    }
}
