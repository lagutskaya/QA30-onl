package HomeWorks.HW3.AdditionalTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        inputCount();
    }

    public static void inputCount() {
        System.out.println("Пожалуйста, введите сумму вклада");
        Scanner scanner = new Scanner(System.in);
        float initialDeposit = scanner.nextFloat();
        numberOfMonths(initialDeposit);
    }

    public static void numberOfMonths(float initialDeposit) {
        System.out.println("Пожалуйста, введите количество месяцев");
        Scanner scanner = new Scanner(System.in);
        int months = scanner.nextInt();
        finalSum(initialDeposit, months);
    }

    public static void finalSum(float initialDeposit, int months) {
        float finalAmount = initialDeposit;
        for (int month = 1; month <= months; month++) {
            finalAmount += finalAmount * 0.07;
        }
        System.out.println("Конечная сумма через " + months + " месяцев составит : " + finalAmount);
    }
}
