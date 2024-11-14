package student;

public class Stamp extends Transformation {
    /**
     * The stamp image.
     */
    private RGBImage toStamp;

    /**
     * Constructor that create a stamp image.
     * @param toStamp the stamp image
     */
    public Stamp(RGBImage toStamp) {
        this.toStamp = toStamp;
    }

    @Override
    public RGBImage transform(RGBImage image) {
        return super.transform(image);
    }

    @Override
    public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image) {
        if (x >= toStamp.getWidth() || y >= toStamp.getHeight()) {
            return originalColor;
        } else {
            int averageR = (originalColor.getRed() + toStamp.getColor(x, y).getRed()) / 2;
            int averageG = (originalColor.getGreen() + toStamp.getColor(x, y).getGreen()) / 2;
            int averageB = (originalColor.getBlue() + toStamp.getColor(x, y).getBlue()) / 2;
            return new RGBColor(averageR, averageG, averageB);
        }
    }
}
