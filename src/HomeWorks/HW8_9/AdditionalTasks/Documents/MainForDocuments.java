package HomeWorks.HW8_9.AdditionalTasks.Documents;


import HomeWorks.HW8_9.AdditionalTasks.Exceptions.ABCException;
import HomeWorks.HW8_9.AdditionalTasks.Exceptions.EndOn1a2bException;
import HomeWorks.HW8_9.AdditionalTasks.Exceptions.StartWith555Exception;

import java.util.Date;

public class MainForDocuments {
    public static void main(String[] args) {
        Registry registry = new Registry();

        try {
            GoodsContract goodsContract = new GoodsContract("ab1234", new Date(), "123", 10);
            EmployeeContract employeeContract = new EmployeeContract("555test", new Date(), 55789, new Date(), "Иванов");
            Invoice invoice = new Invoice("ends on 1a2", new Date(), 5000.0, "1231");

            checkDocumentNumber(goodsContract.getDocumentNumber());
            checkDocumentNumber(employeeContract.getDocumentNumber());
            checkDocumentNumber(invoice.getDocumentNumber());

            registry.saveDocument(goodsContract);
            registry.saveDocument(employeeContract);
            registry.saveDocument(invoice);

            for (int i = 0; i < registry.documents.length; i++) {
                if (registry.documents[i] != null) {
                    registry.getDocumentInfo(registry.documents[i]);
                }
            }
        } catch (ABCException | StartWith555Exception | EndOn1a2bException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static void checkDocumentNumber(String documentNumber) throws ABCException, StartWith555Exception, EndOn1a2bException {
        if (documentNumber.contains("abc")) {
            throw new ABCException("Номер документа содержит последовательность 'abc'");
        }

        if (documentNumber.startsWith("555")) {
            throw new StartWith555Exception("Номер документа начинается с последовательности '555'");
        }

        if (documentNumber.endsWith("1a2b")) {
            throw new EndOn1a2bException("Номер документа оканчивается на последовательность '1a2b'");
        }
    }
}
