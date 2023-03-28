package com.technikoller.tddworkshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

}
