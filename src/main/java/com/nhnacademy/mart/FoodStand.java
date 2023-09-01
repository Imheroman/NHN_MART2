package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {
    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }

    // TODO add 메서드 구현
    public void add(Food food) {
        this.foods.add(food);
    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public void remove(String name, int amount) {
        for (int index = 0; index < foods.size(); index++) {
            Food food = foods.get(index);

            if (food.getName().equals(name)) {
                while (amount > 0) {
                    foods.remove(index);
                    amount--;
                }
                break;
            }
        }
    }
}
