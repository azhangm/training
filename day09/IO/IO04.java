package day09.IO;

import java.io.*;
import java.util.Arrays;

public class IO04 {
    public static void main(String[] args) throws IOException {
        String path = "E:" + File.separator + "os" + File.separator + "0-课程简介和学习要求.pptx";
//        System.out.println(path);
        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream("D:" + File.separator + "a.ppt");
        byte[] buff = new byte[1024];
        while (( fis.read(buff))!= -1 ) {
            fos.write(buff);
        }
        System.out.println(Arrays.toString(buff));
//        new FileInputStream();

    }
}
