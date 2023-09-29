package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader
public class Demo7 {
    public static void main(String[] args) throws IOException {
        //Reader reader = new FileReader("d:/test.txt");

        // 1. 一次 read 一个字符
//        while (true) {
//            int c = reader.read();
//            if (c == -1) {
//                // 读取完毕
//                break;
//            }
//            char ch = (char) c;
//            System.out.println(ch);
//        }

//        try {
//            // 2. 一次 read 多个字符
//            while (true) {
//                char[] cbuf = new char[3];
//                // n 表示读到的字符个数
//                int n = reader.read(cbuf);
//                if (n == -1) {
//                    // 读取完毕
//                    break;
//                }
//                System.out.println("n = " + n);
//                for (int i = 0; i < n; i++) {
//                    System.out.println(cbuf[i]);
//                }
//            }
//        } finally {
//            // 3. 一个文件使用完了，要记得，close!!!
//            reader.close();
//        }

        try (Reader reader = new FileReader("d:/test.txt");) {
            // 2. 一次 read 多个字符
            while (true) {
                char[] cbuf = new char[3];
                // n 表示读到的字符个数
                int n = reader.read(cbuf);
                if (n == -1) {
                    // 读取完毕
                    break;
                }
                System.out.println("n = " + n);
                for (int i = 0; i < n; i++) {
                    System.out.println(cbuf[i]);
                }
            }
        }
    }
}
