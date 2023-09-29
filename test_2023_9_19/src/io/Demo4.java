package io;

import java.io.File;
import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        File f = new File("d:/");
        String[] files = f.list();
        System.out.println(Arrays.toString(files));
    }
}
