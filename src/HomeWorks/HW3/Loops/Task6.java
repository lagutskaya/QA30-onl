package HomeWorks.HW3.Loops;

public class Task6 {
    public static void main(String[] args) {
        outputSquare();
    }

    public static void outputSquare() {
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println("Квадрат числа " + i + " равен " + square);
        }
    }
}
