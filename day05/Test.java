package day05;

public class Test{
    public static void main(String[] args) {
        Graph square = new Square(4);
        System.out.println("���������");
        System.out.println( square.getArea());
        System.out.println("�������ܳ�");
        System.out.println( square.getPerimeter());
        Graph rectangular = new Rectangular(4,3);
        System.out.println("���������");
        System.out.println( square.getArea());
        System.out.println("�������ܳ�");
        System.out.println( square.getPerimeter());
        Graph circle = new Circle(3);
        System.out.println("Բ���");
        System.out.println( square.getArea());
        System.out.println("Բ�ܳ�");
        System.out.println( square.getPerimeter());
    }
}
