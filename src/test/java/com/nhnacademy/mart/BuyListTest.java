package com.nhnacademy.mart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuyListTest {

    @Test
    @DisplayName("BuyList Add()에 장보기 목록이 비었을 때")
    public void testAddEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BuyList().add(""));
    }

    @Test
    @DisplayName("BuyList Add()에 음식들의 수량을 음수로 입력했을 때")
    public void testAddNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BuyList().add("양파 -1"));
    }

}