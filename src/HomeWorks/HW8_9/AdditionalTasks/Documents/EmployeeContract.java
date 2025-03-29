package HomeWorks.HW8_9.AdditionalTasks.Documents;

import java.util.Date;

public class EmployeeContract extends AbstractDocument{
    private int employeeID;
    private Date contractEndDate;
    private String employeeName;

    public EmployeeContract(String documentNumber, Date documentDate, int employeeID, Date contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.employeeID = employeeID;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }
    public String getDocumentNumber() {
        return "EC" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракт с сотрудником: Номер документа - " + documentNumber +
                ", Дата документа - " + documentDate +
                ", ID сотрудника - " + employeeID +
                ", Дата окончания контракта - " + contractEndDate +
                ", Имя сотрудника - " + employeeName);
    }

}
