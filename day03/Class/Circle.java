package day03.Class;

public class Circle {
  private int x ;
  private int y;
  private int r;

  public float getPerimeter() {
      return (float) (2 * r * Math.PI);
  }

  public float getArea() {
    return (float) (Math.PI * Math.pow(r , 2));
  }

  public boolean isIntersection(Circle c) {
    int x = c.getX();
    int y = c.getY();
    double distance = Math.sqrt((x - this.x) * (x - this.x + (y - this.y) * (y - this.y)));
    System.out.println(distance);
    return c.getR() + r > distance;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setR(int r) {
    this.r = r;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getR() {
    return r;
  }
}
