package io;

import java.io.File;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("d:/test.txt");
//        boolean ret = file.delete();
//        System.out.println("ret = " + ret);

        file.deleteOnExit();
        Thread.sleep(5000);
        System.out.println("进程结束！");
    }
}
