package student;

public class ColorPallet extends Transformation {
    /**
     * The pallet that has many RGB color.
     */
    private RGBColor[] pallet;

    /**
     * Constructor that create a color pallet.
     * @param pallet the array that contain many colors
     */
    public ColorPallet(RGBColor[] pallet) {
        this.pallet = pallet;
    }

    @Override
    public RGBImage transform(RGBImage image) {
        return super.transform(image);
    }

    @Override
    public RGBColor do_transform(int x, int y, RGBColor originalColor, RGBImage image) {
        double closestDis = RGBColor.distance(image.getColor(x, y), pallet[0]);
        int closestIndex = 0;
        for (int k = 1; k < pallet.length; k++) {
            double distance = RGBColor.distance(image.getColor(x, y), pallet[k]);
            if (distance < closestDis) {
                closestDis = distance;
                closestIndex = k;
            }
        }
        return pallet[closestIndex];
    }
}
