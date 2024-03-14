package Factory;

import Factory.Products.Button;
import Factory.Products.Menu;

public interface UIFactory {
    Button createButton();

    Menu createMenu();
}
