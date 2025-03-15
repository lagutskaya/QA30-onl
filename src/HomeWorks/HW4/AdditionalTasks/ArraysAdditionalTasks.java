package HomeWorks.HW4.AdditionalTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysAdditionalTasks {
    public static void main(String[] args) {
        setArraySize();
    }

    public static void setArraySize() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Пожалуйста, введите размер массива (больше 5 и меньше или равно 10 : ");
            n = scanner.nextInt();
            if (n >= 5 && n <= 10) {
                break;
            } else {
                System.out.println("Размер массива должен быть 5 или меньше или равно 10. Повторите ввод");
            }
        }
        createArray(n);
    }

    public static void createArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Первый массив : ");
        for (int num : array) {
            System.out.println(num + " ");
        }
        createArrayWithCountableNumbers(array);
    }

    public static void createArrayWithCountableNumbers(int[] array) {
        int countable = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                countable++;
            }
        }
        int[] countableArray = new int[countable];
        int i = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                countableArray[i++] = num;
            }
        }
        outputCountableArray(countableArray);
    }

    public static void outputCountableArray(int[] countableArray) {
        if (countableArray.length > 0) {
            System.out.println("Второй массив из четных элементов : ");
            for (int num : countableArray) {
                System.out.println(num + " ");
            }
        } else {
            System.out.println("В первом массиве нет четных элементов");
        }
        System.out.println();
        createArrayWithUncountableIndex();
    }

    public static void createArrayWithUncountableIndex() {
        System.out.println("Задача 5");
        int[] uncountableIndexInArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Созданный массив : " + Arrays.toString(uncountableIndexInArray));
        changeUncountableIndex(uncountableIndexInArray);
    }

    public static void changeUncountableIndex(int[] uncountableIndexInArray) {
        for (int i = 0; i < uncountableIndexInArray.length; i++) {
            if (uncountableIndexInArray[i] % 2 != 0) {
                uncountableIndexInArray[i] = 0;
            }
        }
        System.out.println("Массив с измененным нечетным индексом на ноль : " + Arrays.toString(uncountableIndexInArray));
    }
}
