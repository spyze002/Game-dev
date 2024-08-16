import java.awt.Color;
import java.awt.Graphics;

public class Player {
    private int x, y;
    private int width, height;
    private Color color;

    public Player(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Getters and setters for player properties if needed
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}