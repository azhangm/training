package day08.generic;
/*
* GenericTest<E>
* 泛型类 尖括号里面是一个参数类型
* <E> 这个类型现在是不确定的 只能确定的是 现在 E 是 引用数据类型
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
        /*实例化 不指定泛型 认为此泛型为 ob 类型*/
        a.sex = "dasda";
        a.sex = 123131;
        /*
        * 实例化后 指定泛型 类型确定。
        * */
        GenericTest<Integer> integerGenericTest = new GenericTest<>();
        integerGenericTest.sex = 132;
    }
}
