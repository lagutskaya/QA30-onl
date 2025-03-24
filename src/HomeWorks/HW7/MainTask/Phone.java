package HomeWorks.HW7.MainTask;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("15 pro max", "IPhone", 500.0);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит: " + callerName + ".");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит: " + callerName + " с номера: " + callerNumber + ".");
    }

    public void sendMessage(String... numbers) {
        System.out.print("Сообщение отправлено на номера: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void displayInfo() {
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }
}
