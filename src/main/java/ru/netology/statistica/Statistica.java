package ru.netology.statistica;

public class Statistica {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSells(long[] purchases) {
        long sum = 0;
        long avSells = 0;
        for (long purchase : purchases) {
            sum += purchase;
            avSells = (sum / purchases.length);
        }
        return avSells;
    }

    public int calculateIndexOfMinSells(long[] purchases) {
        int indexOfMin = 0;
        long min = purchases[0];
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < purchases[0]) {
                min = purchases[i];
                indexOfMin = i + 1;
            }
        }
        return indexOfMin;
    }

    public int calculateIndexOfMaxSells(long[] purchases) {
        int indexOfMax = 0;
        long max = purchases[0];
        for (int i = 0; i < purchases.length - 1; i++) {
            if (purchases[i] > purchases[i + 1]) {
                max = purchases[i];
                indexOfMax = i + 1;
            }
        }
        return indexOfMax;
    }

    public int calculateMinSumSellsIndex(long[] purchases) {
        int minSumSellIndex = 0;
        int sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        int avSells = (sum / purchases.length);
        for (int i = 0; i < purchases.length; i++) {
            if (avSells > purchases[i]) {
                minSumSellIndex++;
            }
        }
        return minSumSellIndex;
    }

    public int calculateMaxSumSellsIndex(long[] purchases) {
        int maxSumSellIndex = 0;
        int sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        int avSells = (sum / purchases.length);
        for (int i = 0; i < purchases.length; i++) {
            if (avSells < purchases[i]) {
                maxSumSellIndex++;
            }
        }
        return maxSumSellIndex;
    }
}
