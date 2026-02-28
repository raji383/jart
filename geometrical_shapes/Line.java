package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line {

    public Point a;
    public Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public void draw(Displayable displayable) {
        Color color = getColor();
        double t = 0.0;
        while (t <= 1.0) {
            int x = (int) (a.x + t * (b.x - a.x));
            int y = (int) (a.y + t * (b.y - a.y));
            displayable.display(x, y, color);
            t += 0.001;
        }
    }

    public void draw(Displayable displayable, Color color) {
        double t = 0.0;
        while (t <= 1.0) {
            int x = (int) (a.x + t * (b.x - a.x));
            int y = (int) (a.y + t * (b.y - a.y));
            displayable.display(x, y, color);
            t += 0.001;
        }
    }

    public Color getColor() {
        Random rand = new Random();

        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }
}