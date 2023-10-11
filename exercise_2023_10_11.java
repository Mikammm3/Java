

//import java.util.*;
//
//public class Board {
//    public boolean checkWon(int[][] board) {
//
//
//        for (int i = 0; i < board.length; i++) {
//            // 横三排
//            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] &&
//                    board[i][0] == 1) {
//                return true;
//            }
//            // 竖三列
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[0][j] == board[1][j] && board[1][j] == board[2][j] &&
//                        board[0][j] == 1) {
//                    return true;
//                }
//            }
//        }
//        // 两条斜线
//        if (((board[0][0] == board[1][1] && board[1][1] == board[2][2])
//                || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) &&
//                board[1][1] == 1) {
//            return true;
//        }
//        return false;
//
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String ps = in.nextLine();
//            print(ps);
//        }
//    }
//
//    public static void print(String ps) {
//        int score = 0;
//        if (ps.length() <= 4) {
//            score += 5;
//        } else if (ps.length() >= 8) {
//            score += 25;
//        } else {
//            score += 10;
//        }
//        int cnt1 = 0;// 小写字母
//        int cnt4 = 0;// 大写字母
//        int cnt2 = 0;// 数字
//        int cnt3 = 0;// 符号
//        for (int i = 0; i < ps.length(); i++) {
//            char ch = ps.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//
//                cnt1++;
//            }
//            if (ch >= 'A' && ch <= 'Z') {
//                cnt4++;
//            }
//            if (ch >= '0' && ch <= '9') {
//                cnt2++;
//            }
//            if ((ch >= '!' && ch <= '/')
//                    || (ch >= ':' && ch <= '@')
//                    || (ch >= '[' && ch <= '`')
//                    || (ch >= '{' && ch <= '~')) {
//                cnt3++;
//            }
//        }
//        if (cnt1 == ps.length() || cnt4 == ps.length()) {
//            score += 10;
//        }
//        if (cnt1 != 0 && cnt4 != 0) {
//            score += 20;
//        }
//        if (cnt2 == 1) {
//            score += 10;
//        }
//        if (cnt2 > 1) {
//            score += 20;
//        }
//        if (cnt3 == 1) {
//            score += 10;
//        }
//        if (cnt3 >= 1) {
//            score += 25;
//        }
//        if (cnt1 != 0 && cnt4 != 0 && cnt2 != 0 && cnt3 != 0) {
//            score += 5;
//        } else if ((cnt1 != 0 || cnt4 != 0) && cnt2 != 0 && cnt3 != 0) {
//            score += 3;
//        } else if ((cnt1 != 0 || cnt4 != 0) && cnt2 != 0) {
//            score += 2;
//        }
//        //System.out.println(score);
//        if (score >= 90) {
//            System.out.print("VERY_SECURE");
//        } else if (score >= 80) {
//            System.out.print("SECURE");
//        } else if (score >= 70) {
//            System.out.print("VERY_STRONG");
//        } else if (score >= 60) {
//            System.out.print("STRONG");
//        } else if (score >= 50) {
//            System.out.print("AVERAGE");
//        } else if (score >= 25) {
//            System.out.print("WEAK");
//        } else {
//            System.out.print("VERY_WEAK");
//        }
//    }
//}