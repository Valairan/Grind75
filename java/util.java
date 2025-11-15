public class util {
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    public static void printArray(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
        System.out.println();
    }
}
