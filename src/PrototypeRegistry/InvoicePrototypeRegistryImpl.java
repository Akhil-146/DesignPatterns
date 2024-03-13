package PrototypeRegistry;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {
    private HashMap<InvoiceType, Invoice> invoiceRegistry;

    public InvoicePrototypeRegistryImpl() {
        invoiceRegistry = new HashMap<>();
    }

    private static InvoicePrototypeRegistryImpl invoicePrototypeRegistry;

    public static InvoicePrototypeRegistryImpl getInstance() {
        if (invoicePrototypeRegistry == null) {
            synchronized (InvoicePrototypeRegistryImpl.class) {
                if (invoicePrototypeRegistry == null) {
                    invoicePrototypeRegistry = new InvoicePrototypeRegistryImpl();
                }
            }
        }

        return invoicePrototypeRegistry;
    }

    @Override
    public void addPrototype(Invoice invoice) {
        invoiceRegistry.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType invoiceType) {
        return invoiceRegistry.get(invoiceType);
    }

    @Override
    public Invoice clone(InvoiceType invoiceType) {
        return invoiceRegistry.get(invoiceType).cloneObject();
    }
}
