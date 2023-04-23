//import java.util.Arrays;

import java.util.*;//导入所有类

import static java.lang.Math.*;

public class Test2 {
    public static void main(String[] args) {
        double x = 30;
        double y = 40;
        // 静态导入的方式写起来更方便一些.
        // double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double result = sqrt(pow(x, 2) + pow(y, 2));
        System.out.println(result);
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
    }
}
