package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        setNumberOfColor();
    }

    public static void setNumberOfColor() {
        System.out.println("Пожалуйста, введите число от 1 до 7, чтобы узнать цвет радуги");
        Scanner scanner = new Scanner(System.in);
        int numberOfСolor = scanner.nextInt();
        outputRainbowColor(numberOfСolor);
    }

    public static void outputRainbowColor(int numberOfColor) {
        switch (numberOfColor) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Номера под цифрой " + numberOfColor + " нет в радуге");
        }
    }
}
