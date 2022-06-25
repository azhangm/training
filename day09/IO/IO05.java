package day09.IO;

import sun.nio.cs.ext.GBK;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IO05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:" + File.separator + "abc.txt", true);
//        fos.write(65);
//        fos.write(66);
//        fos.write(67);
        String s = "��� �й� �Ұ� �й�";
        fos.write(s.getBytes(StandardCharsets.UTF_8));
//        ˢ�±����ļ����� �����Ҳû�й�ϵ ������ʹ�ñ���Ҫʹ�ô˷���
        fos.flush();
//        ������Ҫ�ر�
        fos.close();
        System.out.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString(s.getBytes("gbk")));
    }
}
