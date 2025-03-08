package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        setNumber();
    }

    public static void setNumber() {
        System.out.println("Пожалуйста, введите любое целочисленное число для определения его четности или нечетности");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        outputNumber(number);
    }

    public static void outputNumber(int number) {
        if (number % 2 == 0) System.out.println("Число " + number + " четное");
        else System.out.println("Число " + number + " нечетное");
    }
}
