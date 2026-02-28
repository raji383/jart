package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Rectangle implements Drawable {
    
    public  Point topLeft;
    public  Point bottomRight;
    public  Color color;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = getColor();
    }

    @Override
    public void draw(Displayable displayable) {
        int x1 = topLeft.x;
        int y1 = topLeft.y;
        int x2 = bottomRight.x;
        int y2 = bottomRight.y;

        // Côté haut : (x1, y1) -> (x2, y1)
        for (int x = x1; x <= x2; x++) {
            displayable.display(x, y1, color);
        }

        // Côté bas : (x1, y2) -> (x2, y2)
        for (int x = x1; x <= x2; x++) {
            displayable.display(x, y2, color);
        }

        // Côté gauche : (x1, y1) -> (x1, y2)
        for (int y = y1; y <= y2; y++) {
            displayable.display(x1, y, color);
        }

        // Côté droit : (x2, y1) -> (x2, y2)
        for (int y = y1; y <= y2; y++) {
            displayable.display(x2, y, color);
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
