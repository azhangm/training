package day03.Class;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setX(1);
        c.setY(2);
        c.setR(2);
        System.out.println("c圆的面积" + c.getArea());
        System.out.println("c圆的周长" + c.getPerimeter());
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(3);
        circle.setR(3);
        System.out.println("circle圆的面积" + circle.getArea());
        System.out.println("circle圆的周长" + circle.getPerimeter());

        System.out.println("两个圆是否相交:" + c.isIntersection(circle));
    }
}
