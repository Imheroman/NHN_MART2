package com.nhnacademy.mart;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasketTest extends TestCase {

    @Test
    @DisplayName("Food가 Null일 때 오류")
    public void testAdd() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Basket().add(null));
    }
}