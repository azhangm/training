package day05;

import javax.sql.DataSource;

public  class Circle extends Graph {

    private int r;
    public static final double PI = 3.14;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public double getPerimeter() {
        return (float) (2 * r * PI);
    }

    public double getArea() {
        return (float) (PI * Math.pow(r , 2));
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
