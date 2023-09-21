
// 牛客网 OR63 删除公共字符
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String s1 = in.nextLine();
//            String s2 = in.nextLine();
//            print(s1, s2);
//        }
//
//    }
//
//    public static void print(String s1, String s2) {
//        Set<Character> set = new HashSet<>();
//        for (char ch : s2.toCharArray()) {
//            set.add(ch);
//        }
//        for (char ch : s1.toCharArray()) {
//            if (!set.contains(ch)) {
//                System.out.print(ch);
//            }
//        }
//    }
//}