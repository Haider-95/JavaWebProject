package org.example.javawebdemo.services;


import org.example.javawebdemo.BeerCalculator.MyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    void shouldReturnTrue() {
        assertTrue(myService.isWorking());
    }
    }