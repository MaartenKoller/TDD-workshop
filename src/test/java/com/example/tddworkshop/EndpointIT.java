package com.example.tddworkshop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest
@ExtendWith(SpringExtension.class)
class EndpointIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    private void sumEndpoint() throws Exception {
        // call the endpoint and get a result
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get("/sum"));
        response.andExpect(MockMvcResultMatchers.status().isOk());
    }
}