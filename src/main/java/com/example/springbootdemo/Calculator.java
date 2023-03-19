package com.example.springbootdemo;

public class Calculator {

    public void sum3() {
        // test now compiles so it's green
    }

    public void sum4(byte a, byte b) {
        // test 4 adds sending parameters, let add bytes
    }

    public void sum5(int a, int b) {
    }

    public void sum6(int a, int b) {
        // yup same as 5, nothing to see here, move along :)
    }

    public int sum7(int a, int b) {
        // let's add a return type int, the code itself does not compile anymore since it now requires a return value
        // of the same type. Let's add that as well since compile errors are errors to that need to be fixed ;)
        return 1;
    }

    public int sum8(int a, int b) {
        return 2;
    }

    public int sum9(int a, int b) {
        // let's add a return type int, the code itself does not compile anymore since it now requires a return value
        // of the same type. Let's add that as well since compile errors are errors to that need to be fixed ;)
        if (a == 1) {
            return 2;
        }
        if (a == 2) {
            return 4;
        }
        return 0;
    }

    public int sum10(int a, int b) {
        return a + b;
    }
}
