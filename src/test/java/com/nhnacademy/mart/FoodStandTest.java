package com.nhnacademy.mart;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FoodStandTest extends TestCase {

    @Test
    @DisplayName("FoodStand().remove 갯수가 부족할 때")
    public void testRemove() {
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("키위", 1));

        Assertions.assertThrows(IllegalArgumentException.class, () -> foodStand.remove("양파", 2));
    }
}