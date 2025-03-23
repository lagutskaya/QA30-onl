package HomeWorks.HW6.MainTask;

public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На карточку " + accountNumber + " добавлено " + amount +
                    ". Новый баланс: " + balance + ".");
        } else {
            System.out.println("Сумма депозита должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("С карточки " + accountNumber + " снято " + amount + ". Новый баланс: " + balance + ".");
            } else {
                System.out.println("Недостаточно средств на счете.");
            }
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
        }
    }

    public void displayInfo() {
        System.out.println("Карточка " + accountNumber + ": Текущий баланс: " + balance);
    }
}


