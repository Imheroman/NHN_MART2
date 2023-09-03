package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 고객의 장바구니를 담당하는 클래스
 * Item 클래스와 함께 선언되어 있고, items는 장바구니에 담긴 물품과 수량 정보를 저장한다.
 * add()의 기능은 Item 객체에 food의 이름과 수량을 저장하여 items에 추가한다.
 */
public class BuyList {
    private final ArrayList<Item> items = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(MyLogback.class);

    /**
     * .
     * test
     *
     * @param str 메인 메소드에서 장보기 목록을 한 줄로 입력받은 문자열.
     * @throws IllegalArgumentException 문자열이 들어왔을 때 목록이 비었다고 Exception을 던져준다.
     * @throws IllegalArgumentException 수량으로 음수가 들어왔을 때 잘못된 수라고 Exception을 던져준다.
     *                                  이상 없이 정보가 들어오면 item을 items에 추가한다.
     */
    // add 메서드 생성
    public void add(String str) {
        String[] list = str.split(" ");

        if (list.length == 1) {
            logger.warn("BuyList.add() 실패, 장보기 목록이 비어있음");
            throw new IllegalArgumentException("장보기 목록이 비었습니다. (in BuyList.add())");
        }

        for (int index = 0; index < list.length; index += 2) {
            String name = list[index];
            int amount = Integer.parseInt(list[index + 1]);

            if (amount < 0) {
                logger.warn("BuyList.add() 실패, 수량이 음수로 받아짐");
                throw new IllegalArgumentException("수량은 음수가 아닙니다. (in BuyList.add())");
            }

            items.add(new Item(name, amount));
        }
    }

    /**
     * ButList의 items에 저장하는 Item, 구매 식품의 목록 중 식품 명과 수량을 저장해서 items에 추가된다.
     */
    public static class Item {
        private final String name;
        private final int amount;

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
}
