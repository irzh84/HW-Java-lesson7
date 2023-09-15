package ru.netology.javaqa.hwjava7.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

        System.out.println("Сумма всех продаж = " + actualSum);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.getSalesAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

        System.out.println("Средняя сумма продаж в месяц = " + actualAverage);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

        System.out.println("Номер последнего месяца с пиком продаж = " + actualMaxMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

        System.out.println("Номер последнего месяца с минимумом продаж = " + actualMinMonth);
    }

    @Test
    public void shouldFindMontUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMontUnderAverage = 5;
        int actualMontUnderAverage = service.getMontUnderAverage(sales);

        Assertions.assertEquals(expectedMontUnderAverage, actualMontUnderAverage);

        System.out.println("Количество месяцев, в которых продажи были ниже среднего = " + actualMontUnderAverage);
    }

    @Test
    public void shouldFindMontOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMontOverAverage = 5;
        int actualMontOverAverage = service.getMontOverAverage(sales);

        Assertions.assertEquals(expectedMontOverAverage, actualMontOverAverage);

        System.out.println("Количество месяцев, в которых продажи были выше среднего = " + actualMontOverAverage);
    }
}

