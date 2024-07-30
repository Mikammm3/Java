

// 牛客网 Rational Arithmetic (20)

//import java.util.*;
//
//class Rational {
//    // 有整数部分 + 分数部分
//    // 负号，是否为 0
//    public long integer;// 整数
//    public long numerator;// 展示的分子
//    public long denominator;// 分母
//    public boolean negative;// 是否是负数
//    public boolean isZero;// 分母是 0
//    public long calcNumerator;// 计算时使用的分子
//
//    // 解析分子    2/3
//    public static long parseNumerator(String str) {
//        int index = str.indexOf("/");
//        return Long.parseLong(str.substring(0, index));
//    }
//
//    // 解析分母    2/3
//    public static long parseDenominator(String str) {
//        int index = str.indexOf("/");
//        return Long.parseLong(str.substring(index + 1, str.length()));
//    }
//
//    // 初始化
//    public Rational(long n, long d) {
//        // 输入时，分母不可能为 0，但是经过计算后，分母可能为 0
//        if (d == 0) {
//            this.isZero = !isZero;
//            return;
//        }
//        // 如果分子小于 0，那就是负数
//        if (n < 0) {
//            this.negative = !negative;
//        }
//        // 经过计算后，分母可能小于 0
//        if (d < 0) {
//            this.negative = !negative;
//        }
//
//        // 将 5/3 ---> 1 2/3
//        this.integer = n / d;
//        this.numerator = n - integer * d;
//        this.denominator = Math.abs(d);
//        if (this.numerator > 1 || this.numerator < -1) {
//            // 找 n 和 d 的最大公约数, 化为最简式
//            //  8/3   2 2/3    6/9  3
//            long gcd = getGCD(Math.abs(this.numerator), this.denominator);
//            if (gcd > 0) {
//                this.denominator = this.denominator / gcd;
//                this.numerator = this.numerator / gcd;
//            }
//        }
//        this.calcNumerator = this.integer * this.denominator + this.numerator;
//
//    }
//
//    public static long getGCD(long a, long b) {
//        while (a % b != 0) {
//            long c = a % b;
//            a = b;
//            b = c;
//        }
//        return b;
//    }
//
//    // 加  5/3 + 1/2 =
//    public Rational add(Rational r2) {
//        // 先通分，然后再相加
//        long calcNumerator = this.calcNumerator * r2.denominator + this.denominator * r2.calcNumerator;
//        long denominator = this.denominator * r2.denominator;
//        return new Rational(calcNumerator, denominator);
//    }
//
//    // 减
//    public Rational sub(Rational r2) {
//        // 先通分，然后再相减
//        long calcNumerator = this.calcNumerator * r2.denominator - this.denominator * r2.calcNumerator;
//        long denominator = this.denominator * r2.denominator;
//        return new Rational(calcNumerator, denominator);
//    }
//
//    // 乘  1/2 * 3/4
//    public Rational mul(Rational r2) {
//        // 分子相乘，分母相乘
//        return new Rational(this.calcNumerator * r2.calcNumerator, this.denominator * r2.denominator);
//    }
//
//    // 除   1/2 / 3/4 = 1/2 * 4/3
//    public Rational div(Rational r2) {
//        return new Rational(this.calcNumerator * r2.denominator, this.denominator * r2.calcNumerator);
//    }
//
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        // 如果分母为 0，则输出 Inf
//        if (isZero) {
//            s.append("Inf");
//            return s.toString();
//        }
//        if (this.integer == 0 && this.numerator == 0) {
//            s.append("0");
//            return s.toString();
//        }
//
//        // 输出 Rational ，包括整数部分和小数部分
//        if (this.negative) {
//            s.append("(-");
//        }
//        // 整数部分
//        if (this.integer != 0) {
//            s.append(Math.abs(this.integer));
//            // 整数部分和分数部分需要用空格隔开
//            if (numerator != 0) {
//                s.append(" ");
//            }
//        }
//
//        // 分数部分  可能存在，也可能不存在
//        if (this.numerator != 0) {
//            s.append(Math.abs(this.numerator) + "/" + this.denominator);
//        }
//
//
//        if (this.negative) {
//            s.append(")");
//        }
//        return s.toString();
//    }
//}
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String n1 = in.next();
//            String n2 = in.next();
//            // 创建个对象，来表示有理数
//            Rational r1 = new Rational(Rational.parseNumerator(n1), Rational.parseDenominator(n1));
//            Rational r2 = new Rational(Rational.parseNumerator(n2), Rational.parseDenominator(n2));
//            // 依次打印 加减乘除即可
//            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
//            System.out.println(r1 + " - " + r2 + " = " + r1.sub(r2));
//            System.out.println(r1 + " * " + r2 + " = " + r1.mul(r2));
//            System.out.println(r1 + " / " + r2 + " = " + r1.div(r2));
//        }
//    }
//}


// 牛客网 mkdir
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            String[] paths = new String[n];
//            for (int i = 0; i < n; i++) {
//                paths[i] = in.next();
//            }
//            // 首先对数组进行排序
//            Arrays.sort(paths);
//
//            // 然后遍历数组，剔除掉相同的目录和子目录
//            boolean[] flg = new boolean[n];// 用来标记数组中某些元素被删除
//            for (int i = 0; i < n - 1; i++) {
//                // 目录相同，剔除目录
//                if (paths[i].equals(paths[i + 1])) {
//                    flg[i] = true;
//                }
//                // 剔除子目录，/a   /ab   /a/b
//                // /a/b 包含 /a，并且 /a/b 长度大于 /a，并且 /a/b 在 /a 的后一个字符是 /
//                if (paths[i + 1].contains(paths[i]) && paths[i + 1].length() > paths[i].length() && paths[i + 1].charAt(paths[i].length()) == '/') {
//                    flg[i] = true;
//                }
//            }
//
//            // 最后构造命令并输出即可。
//            for (int i = 0; i < n; i++) {
//                if (!flg[i]) {
//                    System.out.println("mkdir -p " + paths[i]);
//                }
//            }
//
//            System.out.println();
//            // System.out.println(Arrays.toString(paths));
//        }
//    }
//}