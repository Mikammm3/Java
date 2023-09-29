package io;

import java.io.File;

public class Demo6 {
    public static void main(String[] args) {
        // src 就是源，dest 就是目标
        File srcFile = new File("d:/test.txt");
        File destFile = new File("d:/test2.txt");
        boolean ret = srcFile.renameTo(destFile);
        System.out.println("ret = " + ret);
    }
}
