import Facade.ImageEditingManager;

public class FacadeClient {
    public static void main(String[] args) {
        String imagePath = "ImagePath";
        String filterType = "Retro Filter";
        int brightness = 100;

        ImageEditingManager imageEditingManager = new ImageEditingManager();
        String finalImage = imageEditingManager.editImage(imagePath, filterType, brightness);
        System.out.println(finalImage);
    }
}
