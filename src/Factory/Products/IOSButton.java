package Factory.Products;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS Button Clicked...");
    }
}
