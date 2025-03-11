package HomeWorks.HW3.AdditionalTasks;

import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
        outputFibonacci(11, 0, 1);
        inputCount();
    }


    public static void outputFibonacci(int count, int firstNumber, int secondNumber) {
        System.out.println("Задача 1");
        System.out.println("Первые 11 членов последовательности Фибоначчи : ");
        for (int index = 0; index < count; index++) {
            System.out.println(firstNumber);
            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }

    public static void inputCount() {
        System.out.println("Задача 2");

        System.out.println("Пожалуйста, введите сумму вклада");
        Scanner scanner = new Scanner(System.in);
        float initialDeposit = scanner.nextFloat();
        setNumberOfMonths(initialDeposit);
    }

    public static void setNumberOfMonths(float initialDeposit) {
        System.out.println("Пожалуйста, введите количество месяцев");
        Scanner scanner = new Scanner(System.in);
        int months = scanner.nextInt();
        outputFinalSum(initialDeposit, months);
    }

    public static void outputFinalSum(float initialDeposit, int months) {
        float finalAmount = initialDeposit;
        for (int month = 1; month <= months; month++) {
            finalAmount += finalAmount * 0.07;
        }
        System.out.println("Конечная сумма через " + months + " месяцев составит : " + finalAmount);

    }
}
