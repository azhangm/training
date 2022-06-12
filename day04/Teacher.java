package day04;

public class Teacher {
  private   String name ;
  private int age;
  private String professional;

  public Teacher() {
  }

  public Teacher(String name, int age, String professional) {
    this.name = name;
    this.age = age;
    this.professional = professional;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getProfessional() {
    return professional;
  }

  public void setProfessional(String professional) {
    this.professional = professional;
  }

  public void teach() {
    System.out.println("授课...");
  }

  public void mange() {
    System.out.println("管理学生");
  }

}
