import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = 20;

       for  (int j = 0; j<4; j++) {
        for (int i= 0; i <4; i++ ) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0 + (i * size * 2), 0+ (j * size * 2), size, size);
            graphics.fillRect(size + (i * size * 2), size+(j * size * 2), size, size);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(size + (i * size * 2), 0+(j * size * 2), size, size);
            graphics.fillRect(0 + (i * size * 2), size+(j * size * 2), size, size);
            }
        }

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