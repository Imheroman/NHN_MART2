package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {
    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    // add 메서드 구현
    public void add(Food food) {
        this.foods.add(food);
    }

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
