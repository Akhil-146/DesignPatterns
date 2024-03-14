package Factory;

import Factory.Products.AndroidButton;
import Factory.Products.AndroidMenu;
import Factory.Products.Button;
import Factory.Products.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
