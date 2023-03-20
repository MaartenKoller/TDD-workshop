package com.example.tddworkshop;

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

    @Test
    void testSum1() {
        // green!
    }

    @Test
    void testSum2() {
        // write the code to make a test go red, let's call a function on the calculator
//        calculator.sum2(); // this does not compile, why not? because the method called does not exist yet, so it's considered red
    }

    @Test
    void testSum3() {
        // test turns green, yay! what could be a next baby step to improve the test? after the change it should turn
        // red again because it needs a change in the actual code
        calculator.sum3();
    }

    @Test
    void testSum4() {
        // make red
//        calculator.sum4(1, 1);
        // this does not compile again, so it's considered red, but the input is valid,
        // it's just that a primitive is an int by default but the method now takes bytes
    }

    @Test
    void testSum5() {
        // green! what would be the next step to make it go red?
        calculator.sum5(1, 1);
    }

    @Test
    void testSum6() {
        // since everything now seems fine, let's add an assertion
//        assertEquals(2, calculator.sum6(1, 1)); // does not compile because there is no return value
    }

    @Test
    void testSum7() {
        // the code now has a return value
        assertEquals(2, calculator.sum7(1, 1));
        // which makes the test now valid again, but it goes red (fails) all the same
    }

    @Test
    void testSum8() {
        assertEquals(2, calculator.sum8(1, 1));
        // the test is now valid again, and it's green! Are we done?
    }

    @Test
    void testSum9() {
        // let's add a test case to be more sure it's working as intended
        assertEquals(2, calculator.sum9(1, 1));
        assertEquals(4, calculator.sum9(2, 2));
        // since by now you should have a grasp of the process, I've already added the code to make
        // this test go green, what could possibly be wrong?
    }

    @Test
    void testSum10() {
        // let's add a test or two more to be really sure it's working as intended
        assertEquals(2, calculator.sum10(1, 1));
        assertEquals(4, calculator.sum10(2, 2));
        assertEquals(200, calculator.sum10(100, 100));
        assertEquals(7500, calculator.sum10(7000, 500));
        // I finally felt like there was no more wiggle room and that this was the best version of the code for now
        // of course, it depends on your desired functionality
        // we are now testing for int's, so we have a maximum value of 2147483647.
        // as input as well as output! So if needed, write a test to make sure those higher numbers are processed as you
        // would expect.
    }

}
