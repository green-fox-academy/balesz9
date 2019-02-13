import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveDraw {

    public static void mainDraw(Graphics graphics) {
        graphics.drawLine(0, HEIGHT / 3, WIDTH, HEIGHT / 3);
        graphics.drawLine(0, HEIGHT / 3 * 2, WIDTH, HEIGHT / 3 * 2);
        graphics.drawLine(WIDTH/3, 0, WIDTH/3, HEIGHT );
        graphics.drawLine(WIDTH/3*2, 0, WIDTH/3*2, HEIGHT );
            /*graphics.drawRect(WIDTH / 3 * 0, HEIGHT / 3 * 1, WIDTH / 3, HEIGHT / 3);
            graphics.drawRect(WIDTH / 3 * 1, HEIGHT / 3 * 0, WIDTH / 3, HEIGHT / 3);
            graphics.drawRect(WIDTH / 3 * 2, HEIGHT / 3 * 1, WIDTH / 3, HEIGHT / 3);
            graphics.drawRect(WIDTH / 3 * 1, HEIGHT / 3 * 2, WIDTH / 3, HEIGHT / 3);*/
            drawCircles(graphics,WIDTH/2,HEIGHT/2, 108);
            //drawConcentricCircle(WIDTH/2,HEIGHT/2,600,graphics);

    }
    public static void drawCircles(Graphics graphics, int xMid, int yMid, int radius) {
        // end recursion
        if(radius < 5)
            return;

        // Draw circle
        graphics.drawOval(xMid - radius, yMid - radius, radius * 2, radius * 2);

        // start recursion
        //left
        drawCircles(graphics, xMid-radius, yMid, radius / 2);
        //right
        drawCircles(graphics, xMid+radius, yMid, radius / 2);
    }
        public static void drawConcentricCircle(int x, int y, int r, Graphics graphics){
        if (r < 5)
            return;
        graphics.drawOval(x-r/2,y-r/2,r,r);
        r *= 0.75;
        drawConcentricCircle(x,y,r,graphics);
        }

   /* void drawCircle(int x, int y, float radius) {
        ellipse(x, y, radius, radius);
        if(radius > 2) {
            radius *= 0.75f;
            The drawCircle() function is calling itself recursively.
                    drawCircle(x, y, radius);
        }
    }*/


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
