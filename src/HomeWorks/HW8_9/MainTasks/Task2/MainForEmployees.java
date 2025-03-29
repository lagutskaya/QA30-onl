package HomeWorks.HW8_9.MainTasks.Task2;

public class MainForEmployees {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountan = new Accountant();

        director.setPosition();
        worker.setPosition();
        accountan.setPosition();
    }
}
