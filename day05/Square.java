package day05;

public class Square extends Graph{
    private double length;
    @Override
    public double getPerimeter() {
        return length * length;
    }

    @Override
    public double getArea() {
        return length * 4;
    }

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
