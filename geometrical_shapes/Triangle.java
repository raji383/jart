package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Triangle {

    public Point point1;
    public Point point2;
    public Point point3;
    public Color color;

    public Triangle(Point point1, Point point2,Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.color = getColor();
    }

    public void draw(Displayable displayable) {
        Line line = new Line(this.point1, this.point2);
        Line line1 = new Line(this.point2, this.point3);
        Line line2 = new Line(this.point3, this.point1);
        line.draw(displayable, this.color);
        line1.draw(displayable, this.color);
        line2.draw(displayable, this.color);
    }

    public Color getColor() {
        Random rand = new Random();

        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }
}
