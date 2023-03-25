package com.technikoller.tddworkshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

//    private Calculator calculator;

    @GetMapping(path = "/divide")
    public int divideStuff(@RequestParam("digitOne") int digitOne, @RequestParam("digitTwo") int digitTwo) {
        System.out.println("param received, digitOne = " + digitOne);
        System.out.println("param received, digitTwo = " + digitTwo);
        return 1;
    }

}
