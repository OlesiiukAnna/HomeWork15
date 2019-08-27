package home.Task_15;

import java.util.Random;

public class RandomMeanCalculator {

    private Random random;

    public RandomMeanCalculator(Random random) {
        this.random = random;
    }

    public int calculateMean(int listSize) {
        return random.ints(listSize)
                .map(i -> i * i)
                .sum() / listSize;
    }
}
