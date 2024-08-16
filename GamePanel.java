import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    private Player player;

    public GamePanel() {
        // Set preferred size for the panel
        this.setPreferredSize(new Dimension(800, 600));
        // Create a player instance
        player = new Player(100, 100, 50, 50, Color.RED);

        // Add key listener for player movement
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
                    player.move(0, -5);
                } else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
                    player.move(0, 5);
                } else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
                    player.move(-5, 0);
                } else if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
                    player.move(5, 0);
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the player
        player.draw(g);
    }
}