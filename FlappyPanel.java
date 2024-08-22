import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FlappyPanel extends JPanel implements ActionListener {
    int Bwidth = 360;
    int Bheight = 640;
    int birdX = Bwidth / 8;
    int birdY = Bheight / 2;
    int birdWidth = 34;
    int birdHeight = 24;

    Image BGimg;
    Image Birdimg;
    Image TopObstacle;
    Image BottomObstacle;

    
    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }

    // Imple
    Bird bird ;

    Timer loopGame;

    FlappyPanel(){
        setPreferredSize(new Dimension(Bwidth, Bheight));
        setBackground(Color.BLUE);

        //pic images
        BGimg = new ImageIcon( getClass().getResource("./flappybirdbg.png" )).getImage();
        Birdimg = new ImageIcon(getClass().getResource("./flappybird.png" )).getImage();
        TopObstacle = new ImageIcon(getClass().getResource("./toppipe.png" )).getImage();
        BottomObstacle = new ImageIcon(getClass().getResource("./bottompipe.png" )).getImage();

        bird = new Bird(Birdimg);

        loopGame = new Timer(1000/60, this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(BGimg, 0, 0, Bwidth, Bheight, null);

        //draw bird
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);

    //     //draw obstacles
    //     g.drawImage(TopObstacle, 10, 0, null);
    //     g.drawImage(BottomObstacle, 10, 400, null);
    // } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
