package HomeWorks.HW4.MainTasks;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        setArrays();
    }

    public static void setArrays() {
        System.out.println("Задача 0");
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        int enteredNumber = inputNumber();
        checkEnteredNumber(numbers, enteredNumber);
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число для поиска введенного числа в массиве : ");
        return scanner.nextInt();
    }

    public static void checkEnteredNumber(int[] numbers, int enteredNumber) {
        boolean found = false;
        for (int number : numbers) {
            if (number == enteredNumber) {
                found = true;
                break;
            }
        }
        outputResult(found, enteredNumber);
    }

    public static void outputResult(boolean found, int enteredNumber) {
        if (found) {
            System.out.println("Число " + enteredNumber + " входит в массив");
        } else {
            System.out.println("Число " + enteredNumber + " не входит в массив");
        }
        System.out.println();
        setArraysIntNumbers();
    }

    public static void setArraysIntNumbers() {
        System.out.println("Задача 1");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberToRemove = inputNumberForRemove();
        int[] newArray = removeOccurrences(numbers, numberToRemove);
        outputResult(newArray, numberToRemove, numbers.length);
    }

    public static int inputNumberForRemove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        return scanner.nextInt();
    }

    public static int[] removeOccurrences(int[] numbers, int numberToRemove) {
        int count = 0;
        for (int number : numbers) {
            if (number == numberToRemove) {
                count++;
            }
        }
        return createNewArray(numbers, count, numberToRemove);
    }

    public static int[] createNewArray(int[] numbers, int count, int numberToRemove) {
        int[] newArray = new int[numbers.length - count];
        int index = 0;

        for (int number : numbers) {
            if (number != numberToRemove) {
                newArray[index++] = number;
            }
        }
        return newArray;
    }

    public static void outputResult(int[] newArray, int numberToRemove, int originalLength) {
        if (newArray.length == originalLength) {
            System.out.println("Число " + numberToRemove + " не найдено в массиве.");
        } else {
            System.out.print("Новый массив без числа " + numberToRemove + ": ");
            printArray(newArray);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.println();
        setValuesForArrays();
    }

    public static void setValuesForArrays() {
        System.out.println("Задача 2");
        int size = inputArraySize();
        int[] numbers = createRandomArray(size);

        int max = findMax(numbers);
        int min = findMin(numbers);
        double average = calculateAverage(numbers);
        outputResults(max, min, average);
    }

    public static int inputArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите размер массива :");
        return scanner.nextInt();
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    public static void outputResults(int max, int min, double average) {
        System.out.println("Максимальное значение : " + max);
        System.out.println("Минимальное значение : " + min);
        System.out.println("Среднее значение : " + average);
        System.out.println();
        initializeArrays();
    }

    public static void initializeArrays() {
        System.out.println("Задача 3");
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        setValuesForArray(array1, "первого");
        setValuesForArray(array2, "второго");
        outputArrays(array1, array2);
    }

    public static void setValuesForArray(int[] array, String arrayName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел для " + arrayName + " массива:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static void outputArrays(int[] array1, int[] array2) {
        System.out.println("Значения первого массива: ");
        outputArrays(array1);
        System.out.println("Значения второго массива: ");
        outputArrays(array2);
        averageValues(array1, array2);
    }

    public static void outputArrays(int[] array) {
        for (int number : array) {
            System.out.println(number + " ");
        }
    }

    public static void averageValues(int[] array1, int[] array2) {
        double average1 = calculateAverageForArrays(array1);
        double average2 = calculateAverageForArrays(array2);
        displayComparison(average1, average2);
    }

    public static double calculateAverageForArrays(int[] array) {
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    public static void displayComparison(double average1, double average2) {
        System.out.println("Среднее арифметическое первого массива: " + average1);
        System.out.println("Среднее арифметическое второго массива: " + average2);
        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше второго.");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое второго массива больше первого.");
        } else {
            System.out.println("Средние арифметические равны.");
        }
    }
}
