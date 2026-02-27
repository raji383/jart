package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public  class Point implements Drawable {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point random(int width, int height) {
        Random rand = new Random();
        int a = rand.nextInt(width);
        int b = rand.nextInt(height);
        return new Point(a, b);
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, getColor());
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