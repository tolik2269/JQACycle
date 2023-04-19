package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceCountTest {
    @Test
    public void restThreeMonths(){
        ServiceCount serviceCount= new ServiceCount();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        long expected = 3;
        long actual = serviceCount.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void restTwoMonths(){
        ServiceCount serviceCount= new ServiceCount();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        long expected = 2;
        long actual = serviceCount.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, actual);
    }
}
