package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//一副牌
public class CardList {
    //因为是不会被修改，所以用final修饰
    public static final String[] SUITS =
            {"♦", "♥", "♠", "♣"};//牌的花色
    //public List<Card> cards = new ArrayList<>();

    //生成52张牌，去掉大小王
    public List<Card> buyCards() {
        List<Card> ret = new ArrayList<>();
        for (int i = 0; i < SUITS.length; i++) {
            //A-K
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(SUITS[i], j);
                ret.add(card);
            }
        }
        return ret;
    }

    //洗牌
    public void shuffle(List<Card> list) {
        Random random = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            //生成 [0,i)的随机数
            int tmp = random.nextInt(i);
            swap(list, i, tmp);//交换
        }
    }

    private void swap(List<Card> list, int i, int j) {
        Card tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }


}
