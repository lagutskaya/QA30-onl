package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        getMonthNumber();
    }

    public static void getMonthNumber() {
        System.out.println("Пожалуйста, введите число от 1 до 12, чтобы узнать название месяца");
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        outputMonthNumber(numberOfMonth);
    }

    public static void outputMonthNumber(int numberOfMonth) {

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
    }
}
