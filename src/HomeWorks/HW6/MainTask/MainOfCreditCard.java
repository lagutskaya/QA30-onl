package HomeWorks.HW6.MainTask;

public class MainOfCreditCard {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1234_1234_1234", 1000);
        CreditCard card2 = new CreditCard("2345_2345_2345", 2000);
        CreditCard card3 = new CreditCard("3456_3456_3456", 3000);

        card1.deposit(500);
        card2.deposit(1000);
        card3.withdraw(3000);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}
