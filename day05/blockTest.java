package day05;

public class blockTest {
    int a = 10;
    {
        int b = a + 10;
        System.out.println("���ǳ�ʼ�������");
        System.out.println(b);
    }

    public blockTest() {

        System.out.println("�����޲ι��췽��");
    }

    public static void main(String[] args) {

    new blockTest();
    }
}
