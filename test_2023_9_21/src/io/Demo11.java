package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("d:/test.txt")) {
            // 此时，scanner 就是从文件读取了
            Scanner scanner = new Scanner(inputStream);
            // 就可以使用 scanner 读取后续的数据
            String str = scanner.next();
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
