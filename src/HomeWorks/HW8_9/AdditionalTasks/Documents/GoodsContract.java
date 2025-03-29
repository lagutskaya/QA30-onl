package HomeWorks.HW8_9.AdditionalTasks.Documents;

import java.util.Date;

public class GoodsContract extends AbstractDocument{
    private String goodsType;
    private int goodsQuantity;

    public GoodsContract(String documentNumber, Date documentDate, String goodsType, int goodsQuantity) {
        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsQuantity = goodsQuantity;
    }
    public String getDocumentNumber() {
        return "GC" + documentNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракт на поставку товаров: Номер документа - " + documentNumber +
                ", Дата документа - " + documentDate +
                ", Тип товара - " + goodsType +
                ", Количество товаров - " + goodsQuantity);
    }
}
