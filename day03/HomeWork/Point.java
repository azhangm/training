package day03.HomeWork;

public class Point {
    private int x;
    private int y;

    public void printPoint(){
        System.out.println("该点的坐标为：(" + x +"," + y +")");
    }

    public double distance(Point point){
        int dx = x - point.getX();
        int dy = y - point.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
