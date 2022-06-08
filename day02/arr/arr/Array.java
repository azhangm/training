package day02.arr.arr;
/*
 * 数组 一个容器 存储相同数据的一组数据
 * 引用类型 不属于基本数据类型
 * 使用场景：处理同类型数据
 * 初始化 ： 1、动态初始化 new int[5]
 *          2、静态初始化
 * 未指定内容 数组元素会有默认值 (float double) --->  0.0
 *                           布尔类型 ----> false
 *                           字符 ---> '\u0000'
 * 数组名代表的是 系统开辟的 内存地址的起始地址。
 * 数组是定长的容器，创建的时候多大空间，以后就多大空间，不可以改变。
 * */

public class Array {
    public static void main(String[] args) {

        char [] a = new char[5];
        for (char c : a) {
            System.out.println(' ');
        }
    }
}
