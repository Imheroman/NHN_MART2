package com.nhnacademy.mart;

import java.util.ArrayList;

/**
 * 마트에 들어온 손님을 의미하는 클래스이다.
 */
public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;
    private int money = 20_000;

    // 고객 장바구니
    private Basket basket;

    /**
     * 생성자를 통해 BuyList를 입력받는다.
     *
     * @param buyList NhnMartShell(Main)에서 장보기 목록을 미리 입력받고 넘겨준 장보기 List
     */
    public Customer(BuyList buyList) {
        if (buyList.getItems().isEmpty()) {
            throw new IllegalArgumentException("쇼핑 목록이 비었습니다.");
        }

        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    /**
     * 음식들을 장바구니에 담는 과정.
     * <p>
     * 현재 이 고객(Customer)가 어떤 목록들이 필요한지 items(name, amount)에 담아와서 foreach로 한 개씩 꺼내본다.
     * 진열대(foods)와 동일한 상품이 있으면 상품의 가격을 가져와서 총 비용으로 저장한다.
     * 장바구니에 새로운 음식을 담아준다.
     * </p>
     *
     * @param foodStand NhnMart에서 생성한 마트에 있는 음식 목록들을 NhnMartShell(Main)에서 받는다.
     */
    // pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        ArrayList<BuyList.Item> items = buyList.getItems();

        for (BuyList.Item item : items) {
            ArrayList<Food> foods = foodStand.getFoods();
            String name = item.getName();
            int price = 0;

            for (int index = 0; index < foods.size(); index++) {
                Food food = foods.get(index);

                if (food.getName().equals(name)) {
                    price = item.getAmount() * food.getPrice();
                    break;
                }

                if (index == foods.size() - 1) {
                    throw new IllegalArgumentException(name + "은(는) 마트에 없는 상품입니다. (in Customer.add()) ");
                }
            }

            foodStand.remove(name, item.getAmount());
            basket.add(new Food(name, price));
        }

    }

    // payTox 메서드 구현
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
