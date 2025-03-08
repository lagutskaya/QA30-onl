package HomeWorks.HW3.Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        setNumber();
    }

    public static void setNumber() {
        System.out.println("Пожалуйста, введите любое целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        sumOfNumbers(number);
    }

    public static void sumOfNumbers(int number) {
        if (number <= 0) System.out.println("Пожалуйста, введите положительное число");
        else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);

        }
    }
}
