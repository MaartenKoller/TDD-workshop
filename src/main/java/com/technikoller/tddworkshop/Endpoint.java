package com.technikoller.tddworkshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

//    private Calculator calculator;

    @GetMapping(path = "/sum")
    public int sumStuff() {
        return 1;
    }

}
