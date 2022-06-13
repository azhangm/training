package day05;

public class blockTest {
    int a = 10;
    {
        int b = a + 10;
        System.out.println("我是初始化代码块");
        System.out.println(b);
    }

    public blockTest() {

        System.out.println("我是无参构造方法");
    }

    public static void main(String[] args) {

    new blockTest();
    }
}
