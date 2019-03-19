package com.greenfoxacademy.restbackend;


import com.greenfoxacademy.restbackend.controller.ApiController;
import com.greenfoxacademy.restbackend.service.MyService;
import javafx.animation.Animation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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

    @Test
    public void greeter_ReturnError_WithoutNameAndTitle() throws Exception {

        mockMvc.perform(
                get("/greeter?"))
                .andExpect(MockMvcResultMatchers.jsonPath("error")
                        .value("Please provide a name and a title!"));

    }

    @Test
    public void append_ReturnWordWithAAppendad() throws Exception {

        mockMvc.perform(
                get("/appenda/macsk"))
                .andExpect(MockMvcResultMatchers.jsonPath("appended")
                        .value("macska"))
                .andExpect(status().isOk());;
    }

    @Test
    public void append_WithoutInput() throws Exception {

        mockMvc.perform(
                get("/appenda/"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void doUntil_ReturnSum_IsOk() throws Exception{


        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result", is(15)))
                .andExpect(status().isOk());
    }


}

