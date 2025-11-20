import java.util.*;

public class knapsacks {
    public static void main(String[] args) {

        int[] weights = { 2, 3, 4, 5 };
        int[] values = { 3, 4, 5, 6 };
        int capacity = 5;
        System.out.println(knapsack(weights, values, capacity));

        int[] fractionalWeights = { 10, 20, 30 };
        int[] fractionalValues = { 60, 100, 120 };
        int fractionalCapacity = 50;

        System.out.println(fractionalKnapsack(fractionalWeights, fractionalValues, fractionalCapacity));
    }

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        int[][] results = new int[n][capacity + 1];

        for (int i = 0; i < n; i++) {
            int currentWeight = weights[i];
            int currentValue = values[i];
            for (int w = 0; w <= capacity; w++) {
                if (currentWeight <= w) {
                    if (i == 0) {
                        results[i][w] = currentValue;
                    } else {
                        results[i][w] = Math.max(results[i - 1][w], results[i - 1][w - currentWeight] + currentValue);
                    }
                } else {
                    results[i][w] = (i == 0) ? 0 : results[i - 1][w];
                }
            }
        }

        return results[n - 1][capacity]; // If we never got stuck
    }

    public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        Integer[] indices = new Integer[n];

        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                double r1 = (double) values[i] / weights[i];
                double r2 = (double) values[j] / weights[j];
                return Double.compare(r2, r1); // descending order
            }
        });

        double totalValue = 0.0;

        for (int i = 0; i < indices.length; i++) {
            int current = indices[i];
            if (capacity >= weights[current]) {
                capacity -= weights[current];
                totalValue += values[current];
            } else {
                totalValue += values[current] * ((double) capacity / weights[current]);
                break;
            }
        }

        return totalValue;
    }
}
