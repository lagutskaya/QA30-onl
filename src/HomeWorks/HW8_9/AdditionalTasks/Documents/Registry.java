package HomeWorks.HW8_9.AdditionalTasks.Documents;

public class Registry {
    Document[] documents = new Document[10];
    private int count = 0;

    public void saveDocument(Document document) {
        if (count < 10) {
            documents[count] = document;
            count++;
        } else {
            System.out.println("Регистр заполнен. Невозможно добавить новый документ.");
        }
    }

    public void getDocumentInfo(Document document) {
        document.printInfo();
    }
}
