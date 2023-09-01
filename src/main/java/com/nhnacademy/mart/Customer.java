package com.nhnacademy.mart;

import java.util.ArrayList;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;
    private int money = 20_000;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        ArrayList<BuyList.Item> items = buyList.getItems();

        for (BuyList.Item item : items) {
            ArrayList<Food> foods = foodStand.getFoods();
            String name = item.getName();
            int price = 0;

            for (Food food : foods) {
                if (food.getName().equals(name)) {
                    price = item.getAmount() * food.getPrice();
                    break;
                }
            }

            basket.add(new Food(name, price));
            foodStand.remove(name, item.getAmount());
        }
    }

    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {
        counter.pay(this);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Basket getBasket() {
        return this.basket;
    }
}
