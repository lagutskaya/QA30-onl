package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Constructions {
    public static void main(String[] args) {
        setMonthNumber();
    }

    public static void setMonthNumber() {
        System.out.println("Задача 1");
        System.out.println("Пожалуйста, введите число от 1 до 12, чтобы узнать к какой поре года относится месяц");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        getMonthNumber(month);
    }

    public static void getMonthNumber(String month) {
        switch (month) {
            case "1":
            case "2":
            case "12":
                System.out.println("Пора года - зима");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("Пора года - весна");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("Пора года - лето");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("Пора года - осень");
                break;
            default:
                System.out.println("Месяца с порядковым номером " + month + " не существует");
                break;
        }
        setNumberOfMonth();
    }

    public static void setNumberOfMonth() {
        System.out.println("Задача 2");
        System.out.println("Пожалуйста, введите число от 1 до 12, чтобы узнать название месяца");
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        outputNumberOfMonth(numberOfMonth);
    }

    public static void outputNumberOfMonth(int numberOfMonth) {

        if (numberOfMonth == 1) System.out.println("Первый месяц года - Январь");
        else if (numberOfMonth == 2) System.out.println("Второй месяц года - Февраль");
        else if (numberOfMonth == 3) System.out.println("Третий месяц года - Март");
        else if (numberOfMonth == 4) System.out.println("Четвертый месяц года - Апрель");
        else if (numberOfMonth == 5) System.out.println("Пятый месяц года - Май");
        else if (numberOfMonth == 6) System.out.println("Шестой месяц года - Июнь");
        else if (numberOfMonth == 7) System.out.println("Седьмой месяц года - Июль");
        else if (numberOfMonth == 8) System.out.println("Восьмой месяц года - Август");
        else if (numberOfMonth == 9) System.out.println("Девятый месяц года - Сентябрь");
        else if (numberOfMonth == 10) System.out.println("Десятый месяц года - Октябрь");
        else if (numberOfMonth == 11) System.out.println("Одинадцатый месяц года - Ноябрь");
        else if (numberOfMonth == 12) System.out.println("Двенадцатый месяц года - Декабрь");
        else {
            System.out.println("Месяца с порядковым номером " + numberOfMonth + " не существует");
        }
        setCountableUncountableNumber();
    }

    public static void setCountableUncountableNumber() {
        System.out.println("Задача 3");
        System.out.println("Пожалуйста, введите любое целочисленное число для определения его четности или нечетности");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        outputCountableUncountableNumber(number);
    }

    public static void outputCountableUncountableNumber(int number) {
        if (number % 2 == 0) System.out.println("Число " + number + " четное");
        else System.out.println("Число " + number + " нечетное");
        setTemperature();
    }

    public static void setTemperature() {
        System.out.println("Задача 4");
        System.out.println("Пожалуйста, введите температуру");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        outputTemperature(temperature);
    }

    public static void outputTemperature(int temperature) {
        if (temperature > 5) System.out.println("Тепло");
        else if (-5 >= temperature && temperature > -20) System.out.println("Нормально");
        else if (-20 >= temperature) System.out.println("Холодно");
        setNumberOfColor();
    }

    public static void setNumberOfColor() {
        System.out.println("Задача 5");
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
