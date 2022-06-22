package generic;

import Normal.A;

import java.util.*;

public class JiCheng {
   public JiCheng(List<?> a) {

   }

    public static void main(String[] args) {
//        ArrayList<Object> a = new ArrayList<>();
//        ArrayList<String> b = new ArrayList<>();
//        a = b;

//        JiCheng jiCheng = new JiCheng(new ArrayList<>());
        LinkedList<String> list = new LinkedList<>();
        list.add("111");
        list.add("132");
        list.add("132");
        list.add("132");
        list.add("132");
        list.pollLast();
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(list);
        System.out.println("普通迭代器--------------------------");
        Iterator<String> its = list.listIterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
        System.out.println("源码迭代----------------");
        for (Iterator<String> lists = list.iterator();lists.hasNext();) {
            System.out.println(lists.next());
        }

    }

}
