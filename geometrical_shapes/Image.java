package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Image implements Displayable {

    public BufferedImage image;

    public Image(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x < 0 || y < 0 || x >= image.getWidth() || y >= image.getHeight())
            return;
        int rgb = color.getRGB();
        image.setRGB(x, y, rgb);
    }

    @Override
    public void save(String filename) {
        try {
            ImageIO.write(image, "png", new File(filename));
            System.out.println("Image saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }
}