import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveSquares {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        graphics.setColor(Color.black);
        graphics.drawRect(0,0,WIDTH-1,HEIGHT-1);
    drawSquareWithLines(graphics,0,0,WIDTH);
    }


     public static void drawSquareWithLines(Graphics graphics, int x, int y ,int width) {
         if (width < 3)
             return;
         graphics.drawLine(x+width/3, y, x+width/3, y+width);
         graphics.drawLine(x+width/3*2, y, x+width/3*2, y+width);
         graphics.drawLine(x, y+width/3, x+width, y+width/3 );
         graphics.drawLine(x,y+width/3*2,x+width,y+width/3*2);
         //start recursion
         drawSquareWithLines(graphics,x+width/3,y,width/3);
         drawSquareWithLines(graphics,x,y+width/3,width/3);
         drawSquareWithLines(graphics,x+width/3*2,y+width/3,width/3);
         drawSquareWithLines(graphics,x+width/3,y+width/3*2,width/3);
    }





    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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

