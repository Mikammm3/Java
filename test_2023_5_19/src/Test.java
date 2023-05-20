import demo1.Card;
import demo1.CardList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CardList cardList = new CardList();
        List<Card> list = cardList.buyCards();
        System.out.println(list);
        cardList.shuffle(list);
        System.out.println(list);
        //每个人的牌
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        //三个人的牌组
        List<List<Card>> hand = new ArrayList<>();
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);

        //玩5轮，在每一轮中，每个人都拿一张牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < hand.size(); j++) {
                Card card = list.remove(0);
                hand.get(j).add(card);
            }
        }
        System.out.println("第一个人的牌：" + hand1);
        System.out.println("第二个人的牌：" + hand2);
        System.out.println("第三个人的牌：" + hand3);

        System.out.println("总抽走的牌：" + hand);

        System.out.println("剩下的牌：" + list);
    }
}







