package day03.HomeWork;

public class Rectangular {
    // ¾ØÕóµÄ×óÏÂ½Ç×ø±ê
    private int x ;
    private int y ;
    // ¾ØÕó³¤
    private int length;
    // ¾ØÕó¿í
    private int width;

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return ( length + width ) * 2;
    }

    public boolean isIntersection(Rectangular r) {
        if ((x < r.getX() && (x + width) > r.getX()) || (x > r.getX() && x < r.getX() + r.getWidth())) {
            return (y < r.getY() && (y + length) > r.getY())|| ( y > r.getY() && y  < r.getY() + r.getLength());
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
