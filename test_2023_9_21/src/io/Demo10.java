package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo10 {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("d:/test.txt", true)) {
            String s = "你好世界";
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
