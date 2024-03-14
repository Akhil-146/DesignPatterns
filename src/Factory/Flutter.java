package Factory;

public class Flutter {
    public static UIFactory getUIFactoryByPlatForm(Platform platform) {
        if (platform.equals(Platform.ANDROID))
            return new AndroidUIFactory();
        else if (platform.equals(Platform.IOS))
            return new IOSUIFactory();
        else
            throw new UnsupportedOperationException("This platform is not yet available");
    }
}
