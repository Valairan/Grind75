public class maximumproductsubarray {
    public static void main(String[] args) {
        int[] n = { 2, 3, -2, 4 };

        System.out.println(maxsubarrayproduct(n));

    }

    private static int maxsubarrayproduct(int[] n) {

        int currentMax = n[0];
        int currentMin = n[0];
        int globalMax = n[0];

        for (int i = 1; i < n.length; i++) {
            int num = n[i];

            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            globalMax = Math.max(currentMax, globalMax);

        }

        return globalMax;
    }
}
