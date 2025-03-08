package HomeWorks.HW3.Constructions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        setTemperature();
    }

    public static void setTemperature() {
        System.out.println("Пожалуйста, введите температуру");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        outputTemperature(temperature);
    }

    public static void outputTemperature(int temperature) {
        if (temperature > 5) System.out.println("Тепло");
        else if (-5 >= temperature && temperature > -20) System.out.println("Нормально");
        else if (-20 >= temperature) System.out.println("Холодно");
    }
}
