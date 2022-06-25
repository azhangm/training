package generic.test01;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;
        List<Integer> list3 = null;
        list = list1;
        list = list2;
        list = list3;
    }
}
