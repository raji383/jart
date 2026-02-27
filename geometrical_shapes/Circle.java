package geometrical_shapes;

import java.util.Random;
import java.awt.Color;

public class Circle implements Drawable {
    private Point center;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public static Circle random(int width, int height) {
        Random rand = new Random();

        int x = rand.nextInt(width);
        int y = rand.nextInt(height);
        int radius = rand.nextInt(300) + 10;

        return new Circle(x, y, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        Color color = getColor();
        double t = 0.0;
        while (t < 360.0) {
            double rad = Math.toRadians(t);
            t += 0.1;
            int x = (int) (center.x + radius * Math.cos(rad));
            int y = (int) (center.y + radius * Math.sin(rad));

            displayable.display(x, y, color);
        }
    }

    @Override
    public Color getColor() {
        Random rand = new Random();

        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }
}
