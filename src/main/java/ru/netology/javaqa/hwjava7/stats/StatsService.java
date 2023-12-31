package ru.netology.javaqa.hwjava7.stats;

public class StatsService {
    public int getSalesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int getSalesAverage(int[] sales) {
        int sum = getSalesSum(sales);
        return sum / sales.length;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMontUnderAverage(int[] sales) {
        int count = 0;
        int averageSale = getSalesAverage(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int getMontOverAverage(int[] sales) {
        int count = 0;
        int averageSale = getSalesAverage(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}

