package HomeWorks.HW3.Loops;

public class Task4 {
    public static void main(String[] args) {
        outputNumber();
    }

    public static void outputNumber() {
        int number = 7;
        while (number <= 98) {
            System.out.println(number);
            number += 7;
        }
    }
}
