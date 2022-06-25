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
        String s = "你好 中国 我爱 中国";
        fos.write(s.getBytes(StandardCharsets.UTF_8));
//        刷新本地文件操作 不添加也没有关系 跨网络使用必须要使用此方法
        fos.flush();
//        流必须要关闭
        fos.close();
        System.out.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString(s.getBytes("gbk")));
    }
}
