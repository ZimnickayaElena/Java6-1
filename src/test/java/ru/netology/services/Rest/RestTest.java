package ru.netology.services.Rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RestTest {
    @Test
    void shouldCalculateForSmallIncome() {
        Rest service = new Rest();
        //ожидаемый результат
        int expected = 3;

        // данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForBigIncome() {
        Rest service = new Rest();
        //ожидаемый результат
        int expected = 2;

        // данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}