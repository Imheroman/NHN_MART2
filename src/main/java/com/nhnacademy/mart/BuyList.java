package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {
    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(String str) {
        String[] list = str.split(" ");

        for (int index = 0; index < list.length; index += 2) {
            String name = list[index];
            int amount = Integer.parseInt(list[index + 1]);

            System.out.println("BuyList add()/ name: " + name + ", amount: " + amount);
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
