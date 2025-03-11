package HomeWorks.HW3.Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        outputUncountableNumbers();
    }

    public static void outputUncountableNumbers() {
        System.out.println("Задача 1");
        for (int number = 1; number < 100; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        outputNumbersWithDecrement();
    }

    public static void outputNumbersWithDecrement() {
        System.out.println("Задача 2");
        for (int number = 5; number > 0; number--) {
            System.out.println(number);
        }
        setPositiveNumber();
    }

    public static void setPositiveNumber() {
        System.out.println("Задача 3");
        System.out.println("Пожалуйста, введите любое целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        outputSumOfNumbers(number);
    }

    public static void outputSumOfNumbers(int number) {
        if (number <= 0) System.out.println("Пожалуйста, введите положительное число");
        else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);
        }
        outputSequence();
    }

    public static void outputSequence() {
        System.out.println("Задача 4");
        int number = 7;
        while (number <= 98) {
            System.out.println(number);
            number += 7;
        }
        outputTenNumbersOfSequence();
    }

    public static void outputTenNumbersOfSequence() {
        System.out.println("Задача 5");
        int number = 0;
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.println(number);
            number -= 5;
        }
        outputSquaresOfNumbers();
    }

    public static void outputSquaresOfNumbers() {
        System.out.println("Задача 6");
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println("Квадрат числа " + i + " равен " + square);
        }
    }
}
