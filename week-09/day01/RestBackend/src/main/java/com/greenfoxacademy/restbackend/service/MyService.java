package com.greenfoxacademy.restbackend.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyService {

    public Map<String, Integer> sumOfNumbers(Integer[] numbers) {
        Map<String, Integer> sumResult = new HashMap<>();
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = numbers[i];
        }
        sumResult.put("result", result);
        return sumResult;
    }

    public Map<String, Integer> multiplyNumbers(Integer[] numbers) {
        Map<String, Integer> sumResult = new HashMap<>();
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        sumResult.put("result", result);
        return sumResult;
    }

    public Map<String, int[]> doubleNumbers(Integer[] numbers) {
        Map<String, int[]> sumResult = new HashMap<>();
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
        sumResult.put("result", result);
        return sumResult;
    }
}
