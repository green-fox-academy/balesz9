package com.greenfoxacademy.restbackend;


import com.greenfoxacademy.restbackend.controller.ApiController;
import com.greenfoxacademy.restbackend.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(ApiController.class)
public class ApiControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MyService myService;

    @Test
    public void doubleTheInput_ReturnDoubleValue_IsOK() throws Exception {

        mockMvc.perform(
                get("/doubling?input=5"))
                .andExpect(MockMvcResultMatchers.jsonPath("received")
                        .value(5))
                .andExpect(MockMvcResultMatchers.jsonPath("result")
                        .value(10));
    }

    @Test
    public void greeter_ReturnGreetingWithNameAndTitle_isOk() throws Exception {

        mockMvc.perform(
                get("/greeter?name=Béla&title=király"))
                .andExpect(MockMvcResultMatchers.jsonPath("welcome_message")
                        .value("Oh, hi there Béla, my dear király!"));

    }
}
