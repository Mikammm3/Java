package io;

import java.io.File;
import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 先让用户输入一个要扫描的目录
        System.out.println("请输入要扫描的路径：");
        String path = scanner.next();
        File file = new File(path);
        if (!file.isDirectory()) {
            System.out.println("路径非法！");
            return;
        }
        // 2. 再让用户输入一个要查询的关键词
        System.out.println("请输入要删除文件的关键词：");
        String word = scanner.next();
        // 3. 可以进行递归的扫描了
        //    通过这个方法完成递归
        scanDir(file, word);
    }

    private static void scanDir(File rootPath, String word) {
        // 1. 先列出 rootPath 中的所有文件和目录
        File[] files = rootPath.listFiles();
        if (files == null) {
            // 当前目录为空，就可以直接返回了
            return;
        }
        // 2. 遍历这里的每个元素，针对不同类型，做出不同处理
        for (File file : files) {
            System.out.println("当前扫描的路径为： " + file.getAbsolutePath());
            if (file.isFile()) {
                // 普通文件，检查文件是否要删除，并执行删除动作
                checkDel(file, word);
            } else {
                // 目录，递归的再去判定子目录里包含的内容
                scanDir(file, word);
            }
        }
    }

    private static void checkDel(File file, String word) {
        if (file.getName().contains(word)) {
            System.out.print("当前扫描文件为: " + file.getAbsolutePath() + ",请确认是否删除(Y/n)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equals("Y") || input.equals("y")) {
                file.delete();
                System.out.println("删除成功！");
            } else {
                System.out.println("取消删除！");
            }
        }
    }
}
