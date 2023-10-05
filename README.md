# MTP-POS
Sistema de ponto de venda.

## Digrama de classes

```mermaid
classDiagram
    class Sale {
        + saleId : String
        + date : String
        + totalAmount : Decimal
        + addItem(item: SaleItem)
        + getItems() : List<SaleItem>
    }

    class SaleItem {
        + productId : String
        + productName : String
        + ncm : String
        + internalNumber : String
        + quantity : int
        + unitPrice : Decimal
        + subtotal : Decimal
    }

    class Customer {
        + cpf : String
        + name : String
        + email : String
    }

    class Product {
        + productId : String
        + productName : String
        + ncm : String
        + internalNumber : String
    }

    Sale "1" *-- "*" SaleItem : contains
    SaleItem --> Product : refers to
    Sale --> Customer : has
    Customer -->| cpf | Product : is owned by
```