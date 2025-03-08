package HomeWorks.HW3.AdditionalTasks;

public class Task1 {
    public static void main(String[] args) {
        outputFibonacci(11, 0, 1);
    }


    public static void outputFibonacci(int count, int firstNumber, int secondNumber) {
        System.out.println("Первые 11 членов последовательности Фибоначчи : ");
        for (int index = 0; index < count; index++) {
            System.out.println(firstNumber);
            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}
