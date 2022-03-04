public class FunWith2DArrays {

    public static int totalElements(int[][] arr) {
        int numRows = arr.length;
        int numColumns = arr[0].length;
        return numRows * numColumns;
    }

    public static void fourCorners(String[][] arr) {
        String topLeft = arr[0][0];
        String topRight = arr[0][arr[0].length - 1];
        String bottomLeft = arr[arr.length - 1][0];
        String bottomRight = arr[arr.length - 1][arr[0].length - 1];
        System.out.println(topLeft);
        System.out.println(topRight);
        System.out.println(bottomLeft);
        System.out.println(bottomRight);
    }

    public static double average(int[][] arr) {
        int sum = 0;
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                sum += arr[row][col];
                count++;
            }
        }
        return (double) sum / count;
    }

    public static int[] indexFound(String[][] arr, String target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col].equals(target)) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

}
