package ru.netology.stats;

import java.security.Provider;
import java.util.Arrays;


public class StatsService {

    public int MinSales(int[] sales) {
        int minMonth = 0; //значение из перого(0) месяца
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце (берётся из массива)
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int MaxSales(int[] sales) {
        int maxMonth = 0; //значение из перого(0) месяца
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце (берётся из массива)
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int sumOfSales(int[] sales) {
        int arr[] = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum, i;
        for (sum = 0, i = arr.length - 1; 0 <= i; sum += arr[i--]) ;
        return sum;
    }

    public int middleSumOfSales(int[] sales) {
        int arr[] = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum, i;
        for (sum = 0, i = arr.length - 1; 0 <= i; sum += arr[i--]) ;
        return sum / 12;
    }

    public int UnderTheMidOfSales(int[] sales) {
        int lessMidMonth = 0;
        int month = 0;
        for (long sale : sales) {
            int Mid = middleSumOfSales(sales);
            if (sale < Mid) {
                lessMidMonth = lessMidMonth+1;
            }
        }
        return lessMidMonth;
    }
    public int OverTheMidOfSales(int[] sales) {
        int overMidMonth = 0;
        int month = 0;
        for (long sale : sales) {
            int Mid = middleSumOfSales(sales);
            if (sale > Mid) {
                overMidMonth = overMidMonth+1;
            }
        }
        return overMidMonth;
    }
}




