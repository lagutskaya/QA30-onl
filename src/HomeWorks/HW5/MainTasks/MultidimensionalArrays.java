package HomeWorks.HW5.MainTasks;

import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        createArray(2, 2, 2);
        createChessBoard();
    }

    public static void createArray(int x, int y, int z) {
        System.out.println("Задача  0");
        int[][][] array = new int[x][y][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        System.out.println("Трехмерный массив : " + changeArrayToString(array));
        enterIncrement(array);
    }

    public static void enterIncrement(int[][][] array) {
        System.out.println("Пожалуйста, введите число, на которое нужно увеличить каждый элемент в массиве : ");
        Scanner scanner = new Scanner(System.in);
        int increment = scanner.nextInt();
        changeArray(array, increment);
    }

    public static void changeArray(int[][][] array, int increment) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increment;
                }
            }
        }
        outputChangedArray(array);
    }

    public static void outputChangedArray(int[][][] array) {
        System.out.println("Измененный массив : " + changeArrayToString(array));
    }

    public static String changeArrayToString(int[][][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    result += array[i][j][k] + " ";
                }
            }
        }

        return result.trim();
    }

    public static void createChessBoard() {
        System.out.println("Задача 1 \n" + "Шахматная доска");
        String[][] chessBoard = new String[8][8];
        fillTheBoard(chessBoard);
    }

    public static void fillTheBoard(String[][] chessBoard) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }
        outputChessBoard(chessBoard);
    }

    public static void outputChessBoard(String[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
