package com.example.springbootdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringbootdemoApplicationTests {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        calculator.sum(1, 2);
    }

    @Test
    void testForExistance() {
        assertNotNull(calculator);
    }

}
