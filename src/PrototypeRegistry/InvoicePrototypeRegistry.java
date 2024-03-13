package PrototypeRegistry;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice invoice);

    Invoice getPrototype(InvoiceType invoiceType);

    Invoice clone(InvoiceType invoiceType);
}
