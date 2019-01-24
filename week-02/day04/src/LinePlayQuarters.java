import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int vonal = 13;
        int split = 16;
        int height2 = HEIGHT / split * 2;
        int width2 = WIDTH / split * 2;
        for (int k= 0; k < split/2; k++) {
            for (int j = 0; j < split / 2; j++) {
                for (int i = 0; i < vonal; i++) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine((width2 * j), (height2 / vonal) * i+height2*k, (width2 / vonal) * (i + 1) + width2 * j, height2*(k+1));
                }
                graphics.setColor(Color.MAGENTA);
                for (int i = 0; i < vonal; i++) {
                    graphics.drawLine((width2 / vonal) * i + width2 * j, height2*k, width2 * (j + 1), (height2 / vonal) * (i + 1)+height2*k);
                }
            }
        }
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