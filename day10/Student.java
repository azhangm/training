package day10;

public class Student extends Reflection01 implements A , B{
    private Integer id;
    private String name;
    public int age;
    protected int b;
    String SEX;
    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
