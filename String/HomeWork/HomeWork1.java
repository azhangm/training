package String.HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // �κ� �� ˫���� ������������ ���� String ����
        System.out.println("������һ���ļ���������׺��");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        System.out.println();
        if (isImg(fileName))
        System.out.println("���ļ���һ��ͼƬ");
        else System.out.println("���ļ�����һ��ͼƬ");
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
