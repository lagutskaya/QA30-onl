package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        setMonthNumber();
    }

    public static void setMonthNumber() {
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
    }
}
