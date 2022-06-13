package day05;

public class Rectangular extends Graph{

    // ¾ØÕó³¤
    private double length;
    // ¾ØÕó¿í
    private double width;

    public Rectangular() {
    }

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width ) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
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
}