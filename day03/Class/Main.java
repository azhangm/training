package day03.Class;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setX(1);
        c.setY(2);
        c.setR(2);
        System.out.println("cԲ�����" + c.getArea());
        System.out.println("cԲ���ܳ�" + c.getPerimeter());
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(3);
        circle.setR(3);
        System.out.println("circleԲ�����" + circle.getArea());
        System.out.println("circleԲ���ܳ�" + circle.getPerimeter());

        System.out.println("����Բ�Ƿ��ཻ:" + c.isIntersection(circle));
    }
}
