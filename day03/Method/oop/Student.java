package day03.Method.oop;

public class Student {
    private String name ;
    private  int age;
    public void study() {
        System.out.println("ѧϰ��...");
    }
    public void doHomeWork() {
        System.out.println("����ҵ��.....");
    }

    public static void main(String[] args) {
        new Student().study();
        new Student().doHomeWork();
    }
}
