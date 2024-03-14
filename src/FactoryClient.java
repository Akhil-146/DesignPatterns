import Factory.Flutter;
import Factory.Platform;
import Factory.Products.Button;
import Factory.Products.Menu;
import Factory.UIFactory;

import java.util.Random;

public class FactoryClient {
    public static void main(String[] args) {
        Platform platform = getRandomPlatform();
        UIFactory uiFactory = Flutter.getUIFactoryByPlatForm(platform);

        Menu menu = uiFactory.createMenu();
        menu.render();

        Button button = uiFactory.createButton();
        button.click();
    }

    public static Platform getRandomPlatform() {
        Random random = new Random();
        int num = random.nextInt();
        if (num % 2 == 0)
            return Platform.ANDROID;
        else
            return Platform.IOS;
    }
}
