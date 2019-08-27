package home.Task_14;

import java.util.Random;
/*
Создать список случайных чисел. Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.
 */
public class Task_14_1 {

    public static void main(String[] args) {
        int listSize = 10;
        RandomMeanCalculator calculator = new RandomMeanCalculator(new Random());

        System.out.println(calculator.calculateMean(listSize));
    }

}
