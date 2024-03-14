package Factory;

import Factory.Products.Button;
import Factory.Products.IOSButton;
import Factory.Products.IOSMenu;
import Factory.Products.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
