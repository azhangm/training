package day08.generic;
/*
* GenericTest<E>
* ������ ������������һ����������
* <E> ������������ǲ�ȷ���� ֻ��ȷ������ ���� E �� ������������
* */
public class GenericTest<E> {
    int age;
    String name;
    E sex;

    public GenericTest() {
    }

    public void dd(E a) {
        E[] A = null;
    }

    public <Q> void v(Q e) {

    }
    public GenericTest(E sex) {
        this.sex = sex;
    }
    static class sub extends GenericTest<String>{
        public static void main(String[] args) {
            sub sub = new sub();

        }
    }
    public static void main(String[] args) {
        GenericTest a = new GenericTest();
        /*ʵ���� ��ָ������ ��Ϊ�˷���Ϊ ob ����*/
        a.sex = "dasda";
        a.sex = 123131;
        /*
        * ʵ������ ָ������ ����ȷ����
        * */
        GenericTest<Integer> integerGenericTest = new GenericTest<>();
        integerGenericTest.sex = 132;
    }
}
