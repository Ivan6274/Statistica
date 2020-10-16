package ru.netology.statistica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticaTest {


    @Test
    public void calculateSum() {
        Statistica service = new Statistica();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateAverageSells() {
        Statistica service = new Statistica();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSells(purchases);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateIndexOfMinSells() {
        Statistica service = new Statistica();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calculateIndexOfMinSells(purchases);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateIndexOfMaxSells() {
        Statistica service = new Statistica();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateIndexOfMaxSells(purchases);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateMinSumSellsIndex() {
        Statistica service = new Statistica();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateMinSumSellsIndex(purchases);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateMaxSumSellsIndex() {
        Statistica service = new Statistica();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateMaxSumSellsIndex(purchases);
        assertEquals(expected, actual);
    }
}