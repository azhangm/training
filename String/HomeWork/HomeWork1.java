package String.HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // 任何 用 双引号 引起来的内容 都是 String 对象
        System.out.println("请输入一个文件名（含后缀）");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        System.out.println();
        if (isImg(fileName))
        System.out.println("该文件是一个图片");
        else System.out.println("该文件不是一个图片");
    }
    public static boolean isImg(String fileName) {
        if (fileName.equals("")) return false;
        String[] types = {"jpg","png"};
        for (String type : types) {
            if (fileName.endsWith(type)) {
                return true;
            }
        }
        return false;
    }
}
