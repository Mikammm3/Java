public class Test {
    public static void main(String[] args) {
        String str = "   ab ab   ";
        System.out.println(str.trim());
    }

    public static void main9(String[] args) {
        String str = "ababcabcd";
        String s = str.substring(1, 3);//[1,3)
        System.out.println(s);//ba
    }

    public static void main8(String[] args) {
        String str = "name=zhangsan&age=10";
        String[] s = str.split("&", 2);
        for (int i = 0; i < s.length; i++) {
            String[] ss = s[i].split("=", 2);
            for (int j = 0; j < ss.length; j++) {
                System.out.println(ss[j]);
            }
        }
    }

    public static void main7(String[] args) {
        String str = "ababcabcd";
        //将第一个c替换成zz
        System.out.println(str.replaceFirst("c", "zz"));
        //将ab替换成zz
//        System.out.println(str.replace("ab", "zz"));
//        System.out.println(str);

        //将a替换成z
        //System.out.println(str.replace('a', 'z'));
    }

    public static void main6(String[] args) {
        /*String str = "hello";
        // 字符串转数组
        char[] ch = str.toCharArray();*/
        // 数组转字符串
        char[] ch = {'a', 'b', 'c'};
        String s2 = new String(ch);

        String s = String.format("%d/%d/%d", 2019, 9, 14);
        System.out.println(s);
    }

    public static void main5(String[] args) {
        /*String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);*/
        /*public static void main(String[] args) {
            String s1 = "hello";
            String s2 = "HELLO";
            // 小写转大写
            System.out.println(s1.toUpperCase());
            // 大写转小写
            System.out.println(s2.toLowerCase());
        }*/
    }

    public static void main4(String[] args) {
        String str = "ababc";
        int index = str.indexOf('a', 2);//返回从2下标开始字符’a‘第一次出现的下标
        //System.out.println(str.indexOf("abc"));//返回字符串abc第一次出现的下标
        /*char ch = str.charAt(2);//访问str中下标为2的字符
        int index = str.indexOf('a');//返回字符’a‘第一次出现的下标
        System.out.println(index);*/
    }

    public static void main3(String[] args) {
        String s1 = "abcd";
        String s2 = "Abcd";
        System.out.println(s1.compareToIgnoreCase(s2));
        /*String str1 = "hello";
        String str2 = "world";
        System.out.println(str1.compareTo(str2));*/
    }

    public static void main2(String[] args) {
        String str1 = "abcde";
        String str2 = "abcde";
        System.out.println(str1.equals(str2));
        /*String str1 = new String("abcde");
        String str2 = new String("abcde");
        System.out.println(str1 == str2);*/
    }

    /*public static void main1(String[] args) {

        //String str = "hello";
        String str = null;//该引用不指向任何对象
        //判断字符串是否为空 相当于判断 str = "" 是否是这个形式
        System.out.println(str.isEmpty());
        //求字符串长度
        //System.out.println("hello".length());

        *//*String str1 = "hello";//方法1

        String str2 = new String("hello");//方法2

        char[] arr = {'a', 'b', 'c'};//将字符数组转化成字符串
        String str3 = new String(arr);//方法3

        String s1 = new String("hello");
        String s2 = new String("world");
        String s3 = s1;*//*


    }*/
}
