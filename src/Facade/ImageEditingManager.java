package Facade;

import Facade.service.*;

public class ImageEditingManager {
    private final ImageEditingFacade imageEditingFacade;

    public ImageEditingManager() {
        ImageLoader imageLoader = new ImageLoader();
        FilterService filterService = new FilterService();
        ImageModifier imageModifier = new ImageModifier();
        ImageWriter imageWriter = new ImageWriter();
        AnalyticsService analyticsService = new AnalyticsService();
        imageEditingFacade = new ImageEditingFacade(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public String editImage(String imagePath, String filterType, int brightness) {
        return imageEditingFacade.editImage(imagePath, filterType, brightness);
    }
}
