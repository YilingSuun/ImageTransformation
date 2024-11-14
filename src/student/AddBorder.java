package student;

public class AddBorder extends Transformation {
    /**
     * The width of the border.
     */
    private int width;
    /**
     * The color of the border.
     */
    private RGBColor borderColor;

    /**
     * Constructor that create a border.
     * @param width the width of the border
     * @param borderColor the color of the border
     */
    public AddBorder(int width, RGBColor borderColor) {
        this.width = width;
        this.borderColor = borderColor;
    }

    @Override
    public RGBImage transform(RGBImage image) {
        return super.transform(image);
    }

    @Override
    public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image) {
        if (x < image.getWidth()) {
            if (y < width) {
                return new RGBColor(borderColor.getRed(), borderColor.getGreen(), borderColor.getBlue());
            }
            if (y >= image.getHeight() - width) {
                return new RGBColor(borderColor.getRed(), borderColor.getGreen(), borderColor.getBlue());
            }
        }
        if (y < image.getHeight()) {
            if (x < width) {
                return new RGBColor(borderColor.getRed(), borderColor.getGreen(), borderColor.getBlue());
            }
            if (x >= image.getWidth() - width) {
                return new RGBColor(borderColor.getRed(), borderColor.getGreen(), borderColor.getBlue());
            }
        }
        return originalColor;
    }
}
