package engineer.maiko.MTPPOS.sales.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private String saleId;
    private String date;
    private BigDecimal totalAmount;
    private List<SaleItem> items = new ArrayList<>();
    private Customer customer;

    public Sale(String saleId, String date, Customer customer) {
        this.saleId = saleId;
        this.date = date;
        this.customer = customer;
        this.totalAmount = BigDecimal.ZERO;
    }

    public void addItem(SaleItem item) {
        items.add(item);
        totalAmount = totalAmount.add(item.getSubtotal());
    }

    public List<SaleItem> getItems() {
        return items;
    }
}

