import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // problem 1

        // part a
        String[][] seatingChart = {
                {"Abby, Don, George, Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };

        for (String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }

        // part b
        seatingChart[1][2] = "Paul";

        for (String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }

        // part c
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        for (String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }

        // part d
        String[] tempArr = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempArr;

        for (String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        // problem 2

        // part a
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        for (int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }

        // part b
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }

        // part c
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(arr1[0][2] + arr2[2][0]);

        String[][] strArr = {{"time"}};
        FunWith2DArrays.fourCorners(strArr);
    }
}
