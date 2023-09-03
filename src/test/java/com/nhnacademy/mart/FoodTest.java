package com.nhnacademy.mart;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodTest extends TestCase {

    @Test
    @DisplayName("Food() name이 공백일 때")
    void testFoodConstructorName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Food("", 123));
    }

    @Test
    @DisplayName("Food() price이 음수일 때")
    void testFoodConstructorPrice() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Food("Food", -1));
    }
}