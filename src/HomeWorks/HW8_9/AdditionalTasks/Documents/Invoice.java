package HomeWorks.HW8_9.AdditionalTasks.Documents;

import java.util.Date;

public class Invoice extends AbstractDocument{
    private double totalAmount;
    private String departmentCode;

    public Invoice(String documentNumber, Date documentDate, double totalAmount, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }
    public String getDocumentNumber() {
        return "INV" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Финансовая накладная: Номер документа - " + documentNumber +
                ", Дата документа - " + documentDate +
                ", Итоговая сумма за месяц - " + totalAmount +
                ", Код департамента - " + departmentCode);
    }
}
