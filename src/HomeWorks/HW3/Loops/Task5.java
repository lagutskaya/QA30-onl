package HomeWorks.HW3.Loops;

public class Task5 {
    public static void main(String[] args) {
        outputNumbers();
    }

    public static void outputNumbers() {
        int number = 0;
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.println(number);
            number -= 5;
        }
    }
}
