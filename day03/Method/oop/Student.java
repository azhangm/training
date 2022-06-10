package day03.Method.oop;

public class Student {
    private String name ;
    private  int age;
    public void study() {
        System.out.println("学习中...");
    }
    public void doHomeWork() {
        System.out.println("做作业中.....");
    }

    public static void main(String[] args) {
        new Student().study();
        new Student().doHomeWork();
    }
}
