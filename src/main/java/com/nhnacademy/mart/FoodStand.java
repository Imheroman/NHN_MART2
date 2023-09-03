package com.nhnacademy.mart;

import java.util.ArrayList;

/**
 * NhnMart의 진열대 역할을 하는 클래스이다.
 */
public class FoodStand {
    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    // add 메서드 구현
    public void add(Food food) {
        this.foods.add(food);
    }

    /**
     * 고객이 장바구니에 음식을 담았을 때 진열대에서 음식을 삭제하는 역할을 하는 method이다.
     *
     * @param name   어떤 음식을 가져갔는지 이름을 받는다.
     * @param amount 음식의 수량을 확인한다.
     */
    // 장바구니에 담은 Food 삭제 구현
    public void remove(String name, int amount) {
        while (amount > 0) {
            for (int index = 0; index < foods.size(); index++) {
                Food food = foods.get(index);

                if (food.getName().equals(name)) {
                    foods.remove(index);
                    break;
                }

                if (index == foods.size() - 1) {
                    throw new IllegalArgumentException(name + "의 개수가 부족합니다. (in FoodStand.remove())");
                }
            }
            amount--;
        }

    }
}
