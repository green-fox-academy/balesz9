import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameter:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        for (int i= 0; i<3; i++ ){
            int a = (int)(Math.random()*WIDTH);
            int c = (int)(Math.random()*10);
            graphics.setColor(new Color(150, c*15, c*25));
            CenterSquare(a, graphics);
            System.out.println((WIDTH/2-a/2)+";"+(HEIGHT/2-a/2)+" "+(WIDTH/2-a/2+a)+";"+(HEIGHT/2-a/2)+" ");
            System.out.println((WIDTH/2-a/2)+";"+(HEIGHT/2-a/2+a)+" "+(WIDTH/2-a/2+a)+";"+(HEIGHT/2-a/2+a)+" ");
            System.out.println(" ");
        }
    }
    public static void CenterSquare(int x1, Graphics smg) {
        smg.fillRect(WIDTH / 2 - x1 / 2, HEIGHT / 2 - x1 / 2, x1, x1);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
