import PrototypeRegistry.Invoice;
import PrototypeRegistry.InvoicePrototypeRegistryImpl;
import PrototypeRegistry.InvoiceType;

public class PrototypeRegistryClient {
    private static final InvoicePrototypeRegistryImpl invoicePrototypeRegistry = InvoicePrototypeRegistryImpl.getInstance();
    public static void main(String[] args) {
        setupRegistry();

        Invoice purchaseInvoice = invoicePrototypeRegistry.getPrototype(InvoiceType.PURCHASE);
        System.out.println("Registry Purchase Invoice ( " + purchaseInvoice.hashCode() + " ) : " +purchaseInvoice);

        Invoice clonePurchaseInvoice1 = purchaseInvoice.cloneObject();
        System.out.println("Cloned Purchase Invoice1 ( " + clonePurchaseInvoice1.hashCode() + " ) : " +clonePurchaseInvoice1);

        Invoice clonePurchaseInvoice2 = purchaseInvoice.cloneObject();
        System.out.println("Cloned Purchase Invoice2 ( " + clonePurchaseInvoice2.hashCode() + " ) : " +clonePurchaseInvoice2);

        System.out.println("_______________________________________________________");

        Invoice salesInvoice = invoicePrototypeRegistry.getPrototype(InvoiceType.SALES);
        System.out.println("Registry Sales Invoice ( " + salesInvoice.hashCode() + " ) : " +salesInvoice);

        Invoice cloneSalesInvoice1 = salesInvoice.cloneObject();
        System.out.println("Cloned Sales Invoice1 ( " + cloneSalesInvoice1.hashCode() + " ) : " +cloneSalesInvoice1);

        Invoice cloneSalesInvoice2 = salesInvoice.cloneObject();
        System.out.println("Cloned Sales Invoice2 ( " + cloneSalesInvoice2.hashCode() + " ) : " +cloneSalesInvoice2);

        System.out.println("_______________________________________________________");

        Invoice serviceInvoice = invoicePrototypeRegistry.getPrototype(InvoiceType.SERVICE);
        System.out.println("Registry Service Invoice ( " + serviceInvoice.hashCode() + " ) : " +serviceInvoice);

        Invoice cloneServiceInvoice1 = serviceInvoice.cloneObject();
        System.out.println("Cloned Service Invoice1 ( " + cloneServiceInvoice1.hashCode() + " ) : " +cloneServiceInvoice1);

        Invoice cloneServiceInvoice2 = serviceInvoice.cloneObject();
        System.out.println("Cloned Service Invoice2 ( " + cloneServiceInvoice2.hashCode() + " ) : " +cloneServiceInvoice2);
    }

    public static void setupRegistry() {
        Invoice purchaseInvoice = new Invoice(21314L, "Ak Agro Limited", 234678.0, "Cheque", InvoiceType.PURCHASE);
        Invoice salesInvoice = new Invoice(13425L, "Akhil", 94975.0, "Credit Card", InvoiceType.SALES);
        Invoice serviceInvoice = new Invoice(72373L, "Akhil", 23657.0, "Cash", InvoiceType.SERVICE);

        invoicePrototypeRegistry.addPrototype(purchaseInvoice);
        invoicePrototypeRegistry.addPrototype(salesInvoice);
        invoicePrototypeRegistry.addPrototype(serviceInvoice);
    }
}
