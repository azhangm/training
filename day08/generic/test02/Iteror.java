package day08.generic.test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteror {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("aa");
    list.add("bb");
    list.add("cc");
    list.add("dd");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
