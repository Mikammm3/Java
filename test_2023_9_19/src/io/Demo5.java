package io;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        File f = new File("d:/java109/aaa/bbb/ccc");
        // boolean ret = f.mkdir();
        boolean ret = f.mkdirs();
        System.out.println("ret = " + ret);
    }
}
