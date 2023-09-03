package com.nhnacademy.mart;

//import com.sun.org.slf4j.Logger;
//import com.sun.org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Customer가 사용할 Basket을 정의한 클래스
 * add()를 사용하여 foods에 Food를 추가한다.
 */
public class Basket {

    private final ArrayList<Food> foods = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(MyLogback.class);

    public void add(Food food) {
        if (Objects.isNull(food)) {
            logger.warn("Basket.add() 실패, food가 비어있음");
            throw new IllegalArgumentException("food가 비었습니다.");
        }
        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
