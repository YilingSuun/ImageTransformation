package student;

public class TransformationUtils {
    /**
     * This function loads the image – apply each
     * transformation (one after another) and then save the final output image.
     * @param transformations an array of transformation objects
     * @param inptfle the input file names
     * @param otpFle the output file names
     */
    public static void transformMany(Transformation[] transformations, String inptfle, String otpFle) {
        RGBImage image = RGBImageUtil.load(inptfle);
        for (int i = 0; i < transformations.length; i++) {
            image = transformations[i].transform(image);
        }
        RGBImageUtil.saveImage(image, otpFle);
    }
}
