package day05;

public class Test{
    public static void main(String[] args) {
        Graph square = new Square(4);
        System.out.println("正方形面积");
        System.out.println( square.getArea());
        System.out.println("正方形周长");
        System.out.println( square.getPerimeter());
        Graph rectangular = new Rectangular(4,3);
        System.out.println("长方形面积");
        System.out.println( square.getArea());
        System.out.println("长方形周长");
        System.out.println( square.getPerimeter());
        Graph circle = new Circle(3);
        System.out.println("圆面积");
        System.out.println( square.getArea());
        System.out.println("圆周长");
        System.out.println( square.getPerimeter());
    }
}
