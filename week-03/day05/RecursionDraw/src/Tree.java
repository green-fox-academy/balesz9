import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

    public static void mainDraw(Graphics graphics) {

        drawTree(graphics,WIDTH/2,HEIGHT/2, 300,150 );
    }
    public static void drawTree(Graphics graphics, int x, int y, int length, int angle) {
        // end recursion
        int x2 = (int)(x+length*Math.sin(angle * Math.PI / 180));
        int y2 = (int)(y+length*Math.cos(angle * Math.PI / 180));
        int x3 = (int)(x+length*Math.sin((angle+60) * Math.PI / 180));
        int y3 = (int)(y+length*Math.cos((angle+60) * Math.PI / 180));


        graphics.drawLine(x,y,x2,y2);
        graphics.drawLine(x,y,x3,y3);


    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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

