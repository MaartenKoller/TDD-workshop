package com.example.springbootdemo;

import com.example.tddworkshop.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

}
