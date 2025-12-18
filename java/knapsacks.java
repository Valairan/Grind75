import java.util.*;

public class knapsacks {
    public static void main(String[] args) {

        int[] weights = { 3, 2, 4, 5, 1 };
        int[] values = { 5, 4, 7, 8, 1 };
        int capacity = 7;
        System.out.println(knapsack(weights, values, capacity));

        int[] fractionalWeights = { 10, 20, 30 };
        int[] fractionalValues = { 60, 100, 120 };
        int fractionalCapacity = 50;

        // System.out.println(fractionalKnapsack(fractionalWeights, fractionalValues,
        // fractionalCapacity));
    }

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        int[][] results = new int[n + 1][capacity + 1];

        for (int indexOfItemInWeights = 1; indexOfItemInWeights <= n; indexOfItemInWeights++) {
            int currentItemWeight = weights[indexOfItemInWeights - 1];
            int currentValue = values[indexOfItemInWeights - 1];

            for (int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++) {
                if (currentItemWeight <= currentCapacity) {
                    results[indexOfItemInWeights][currentCapacity] = Math.max(results[indexOfItemInWeights - 1][currentCapacity], results[indexOfItemInWeights - 1][currentCapacity - currentItemWeight] + currentValue);
                } else {
                    results[indexOfItemInWeights][currentCapacity] = results[indexOfItemInWeights - 1][currentCapacity];
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
