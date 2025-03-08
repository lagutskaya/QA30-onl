package HomeWorks.HW3.Loops;

public class Task1 {
    public static void main(String[] args) {
        outputUncountableNumbers();
    }

    public static void outputUncountableNumbers() {
        for (int number = 1; number < 100; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

    }
}
