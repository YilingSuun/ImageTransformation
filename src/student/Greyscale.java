package student;

public class Greyscale extends Transformation {

    @Override
    public RGBImage transform(RGBImage image) {
        return super.transform(image);
    }

    @Override
    public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image) {
        int sum = originalColor.getGreen() + originalColor.getBlue() + originalColor.getRed();
        int average = sum / 3;
        return new RGBColor(average, average, average);
    }
}
