package student;

public class Brighten extends Transformation {
    /**
     * the changed brightness.
     */
    private int brightness;

    /**
     * Constructor that add brightness.
     * @param brightness the changed brightness
     */
    public Brighten(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public RGBImage transform(RGBImage image) {
        return super.transform(image);
    }

    @Override
    public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image) {
        int green;
        int blue;
        int red;
        //Change the green color.
        if (originalColor.getGreen() + brightness > 255) {
            green = 255;
        } else if (originalColor.getGreen() + brightness < 0) {
            green = 0;
        } else {
            green = originalColor.getGreen() + brightness;
        }
        //change the blue color.
        if (originalColor.getBlue() + brightness > 255) {
            blue = 255;
        } else if (originalColor.getBlue() + brightness < 0) {
            blue = 0;
        } else {
            blue = originalColor.getBlue() + brightness;
        }
        //change the red color.
        if (originalColor.getRed() + brightness > 255) {
            red = 255;
        } else if (originalColor.getRed() + brightness < 0) {
            red = 0;
        } else {
            red = originalColor.getRed() + brightness;
        }
        return new RGBColor(red, green, blue);
    }
}
