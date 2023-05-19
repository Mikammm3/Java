import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static List<Character> answer(String str1, String str2) {
        List<Character> ans = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch + "")) {
                ans.add(ch);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "welcome to cvte";
        String str2 = "come";
        List<Character> ans = answer(str1, str2);
        for (Character x : ans) {
            System.out.print(x);
        }
        System.out.println();
        //System.out.println(ans);
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        ans.add(ret);
        //上面代码完成第一行
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//每一行的第一个

            //处理每一行的中间
            //1
            //1 1
            //1 2 1
            //1 3 3 1
            //1 4 6 4 1
            //前一行
            List<Integer> pervRow = ans.get(i - 1);
            for (int j = 1; j < i; j++) {
                int x = pervRow.get(j - 1) + pervRow.get(j);
                curRow.add(x);
            }

            curRow.add(1);//每一行的最后一个
            ans.add(curRow);
        }
        return ans;
    }
}
