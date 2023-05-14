public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcd");
        //System.out.println(stringBuilder);

        stringBuilder.append(1);//append相当于拼接
        //System.out.println(stringBuilder);
        stringBuilder.append('c');
        stringBuilder.append(true);
        stringBuilder.append("kk");
        //System.out.println(stringBuilder);

        //stringBuilder.setCharAt(0, 'k');
        //System.out.println(stringBuilder);

        stringBuilder.insert(1, "ccccccccccccccccc");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String str = stringBuilder.toString();
        System.out.println(str);
    }
}
