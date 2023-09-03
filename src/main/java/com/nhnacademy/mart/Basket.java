package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Customer가 사용할 Basket을 정의한 클래스
 * add()를 사용하여 foods에 Food를 추가한다.
 */
public class Basket {

    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        if (Objects.isNull(food)) {
            throw new IllegalArgumentException("food가 비었습니다.");
        }
        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
