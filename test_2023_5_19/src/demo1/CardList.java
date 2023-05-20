package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardList {
    public static final String[] SUITS = {"♦", "♥", "♠", "♣"};
    //public List<Card> cards = new ArrayList<>();

    //创建52张牌，去掉大小王
    public List<Card> buyCards() {
        List<Card> ret = new ArrayList<>();
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 1; j < 13; j++) {
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
            int tmp = random.nextInt(i);
            swap(list, i, tmp);
        }
    }

    private void swap(List<Card> list, int i, int j) {
        Card tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }


}
