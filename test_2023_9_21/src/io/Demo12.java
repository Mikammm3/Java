package io;

import java.io.*;

public class Demo12 {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("d:/test.txt", true)) {
            // 这就相当于把字节流转化成字符流了
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println("hello");
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
