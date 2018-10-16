package Task3;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }


    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return String.format("Color: %s\nFilled: %b\nPerimeter: %.3f\nArea: %.3f\n",
                super.getColor(), super.isFilled(), getPerimeter(), getArea());
    }
}
