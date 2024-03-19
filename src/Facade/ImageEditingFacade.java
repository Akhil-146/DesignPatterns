package Facade;

import Facade.model.Image;
import Facade.service.*;

public class ImageEditingFacade {
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    public ImageEditingFacade(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageLoader = imageLoader;
        this.filterService = filterService;
        this.imageModifier = imageModifier;
        this.imageWriter = imageWriter;
        this.analyticsService = analyticsService;
    }

    public String editImage (String imagePath, String filterType, int brightness ) {
        Image image = imageLoader.loadImage(imagePath);
        filterService.applyFilter(image, filterType);
        imageModifier.adjustBrightness(image, brightness);
        imageWriter.saveImage(image);
        analyticsService.storeImage(image);
        return "Image: Applied filter " + filterType + ", Adjusted Brightness to " + brightness + ", Saved Image using Image writer and Stored Image for Analytics using Analytics Service";
    }
}
