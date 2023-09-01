package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {
    private final ArrayList<Item> items = new ArrayList<>();

    // add 메서드 생성
    public void add(String str) {
        String[] list = str.split(" ");

        if (list.length == 1) {
            throw new IllegalArgumentException("장보기 목록이 비었습니다. (in BuyList.add())");
        }

        for (int index = 0; index < list.length; index += 2) {
            String name = list[index];
            int amount = Integer.parseInt(list[index + 1]);

            if (amount < 0) {
                throw new IllegalArgumentException("수량은 음수가 아닙니다. (in BuyList.add())");
            }

            items.add(new Item(name, amount));
        }
    }

    public static class Item {
        private final String name;

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
}
