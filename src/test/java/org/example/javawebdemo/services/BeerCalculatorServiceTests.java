package org.example.javawebdemo.services;


import org.example.javawebdemo.BeerCalculator.BeerCalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeerCalculatorServiceTests {
    // sut = System Under Test
    private final  BeerCalculatorService sut = new BeerCalculatorService();

    @Test
    public void When_18_And_Krogen_And_NotDrunk_Should_Be_Allowed() {
        // ARRANGE
        int age = 18;
        String location = "K";
        float promille = 0.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(true, canBuyBeer);
    }

    @Test
    public void When_18_And_Krogen_And_Exactly_1P_Should_Not_Be_Allowed() {
        // ARRANGE
        int age = 18;
        String location = "K";
        float promille = 1.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(false, canBuyBeer);
    }


    @Test
    public void When_17_And_Krogen_And_NotDrunk_Should_Not_Be_Allowed() {
        // ARRANGE
        int age = 17;
        String location = "K";
        float promille = 0.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(false, canBuyBeer);
    }

    @Test
    public void When_18_And_Krogen_And_AlmostDrunk_Should_Be_Allowed() {
        // ARRANGE
        int age = 18;
        String location = "K";
        float promille = 0.99f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(true, canBuyBeer);
    }


    @Test
    public void When_20_And_In_Systemet_And_NotDrunk_Should_Be_Allowed() {
        int age = 20;
        String location = "S";
        float promille = 0.0f;

        boolean canBuybeer = sut.CanBuyBeer(age, location, promille);

        assertEquals(true, canBuybeer);
    }

    @Test
    public void When_20_And_In_Systemet_And_Drunk_Should_Not_Be_Allowed() {
        int age = 20;
        String location = "S";
        float promille = 1.2f;

        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(false, canBuyBeer);

    }

    @Test
    public void When_19_And_In_Systemet_And_Not_Drunk_Should_Not_Be_Allowed() {
        int age = 19;
        String location = "S";
        float promille = 0.0f;

        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(false, canBuyBeer);


    }

    @Test
    public void When_25_And_Unknown_Location_Should_Not_Be_Allowed() {
        // ARRANGE
        int age = 25;
        String location = "X";
        //helt vilsen
        float promille = 0.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer(age, location, promille);

        // ASSERT
        assertEquals(false, canBuyBeer);
    }

}