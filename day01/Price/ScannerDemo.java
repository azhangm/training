package day01.Price;

import java.util.Scanner;
/**
* 键盘缓存区： 是一个字节数组。里面存放的是用户输入的所有内容。
 * 例如：100 hello world haha 你在做什么？ 200 400 true就是用户输入的，会存放到一个字节数组里。
 * 这个存东西的数组称作键盘缓存区。
 * 一旦键盘缓存区里存入的有内容，就可以通过Scanner对象提取里面的内容。他提供一些列提取方法，可以把缓存区里的内容提取成你需要的类型。
 * 但是如果缓存区里没有内容的话，程序会等待用户输入，用户输入完之后（按了回车之后），输入的内容就会进入缓存区
 *
* */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        键盘缓存区的内容以整型的方式提取出来
//        缓存区： 可认为是一个 字节 数组
        int i = sc.nextInt();
        String next = sc.next();
        System.out.println(i + next);
        System.out.println(sc.nextLine());
    }
}
