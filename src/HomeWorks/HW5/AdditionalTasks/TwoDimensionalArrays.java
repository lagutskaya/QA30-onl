package HomeWorks.HW5.AdditionalTasks;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        createArray();
        setArrayForSorting();
    }

    public static void createArray() {
        System.out.println("Задача 3");
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
        };
        System.out.println("Элементы массива : " + Arrays.deepToString(array));
        sumOfAllElements(array);
    }

    public static void sumOfAllElements(int[][] array) {
        int sum = calculateSum(array);
        System.out.println("Сумма всех элементов массива = " + sum);
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static void setArrayForSorting() {
        System.out.println();
        System.out.println("Задача 5");
        int[][] massive = {
                {1, 7, 3, 2, 4, 5, 6},
                {8, 9, 11, 13, 10, 12, 14}
        };
        System.out.println("Неотсортированные элементы массива :\n" + Arrays.deepToString(massive));
        sortingArray(massive);
    }

    public static void sortingArray(int[][] massive) {
        for (int[] row : massive) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < row.length - 1; i++) {
                    if (row[i] >row[i + 1]){
                        isSorted = false;
                        int buf = row[i];
                        row[i] = row[i + 1];
                        row[i + 1] = buf;
                    }
                }
            }
        }
        outputSortedArray(massive);
    }

    public static void outputSortedArray(int[][] massive) {
        System.out.println("Отсортированные элементы массива : ");
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.println(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}


