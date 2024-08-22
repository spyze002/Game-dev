
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //window dimensions
        int width = 360;
        int height = 640;

        //Create a JFrame
        JFrame window = new JFrame("Happy");

        //set window size and location
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        FlappyPanel panel = new FlappyPanel();
        window.add(panel);
        window.pack();
        //show the window
        window.setVisible(true);


    }
    
}
