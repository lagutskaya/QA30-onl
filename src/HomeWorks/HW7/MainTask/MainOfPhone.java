package HomeWorks.HW7.MainTask;

public class MainOfPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("S23", "Samsung", 150.5);
        Phone phone2 = new Phone("987", "Xiaomi");
        Phone phone3 = new Phone();

        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob", "987-654-3210");

        System.out.println("Номер телефона первого устройства: " + phone1.getNumber());
        System.out.println("Номер телефона второго устройства: " + phone2.getNumber());

        phone1.sendMessage("111-222-3333", "444-555-6666");
    }
}
