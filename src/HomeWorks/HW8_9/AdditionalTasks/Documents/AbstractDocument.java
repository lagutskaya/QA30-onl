package HomeWorks.HW8_9.AdditionalTasks.Documents;

import java.util.Date;

public abstract class AbstractDocument implements Document {
    protected String documentNumber;
    protected Date documentDate;

    public AbstractDocument(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}
