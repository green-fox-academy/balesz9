import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int vonal = 13;
        graphics.setColor(Color.GREEN);
        for (int i = 0 ; i < vonal; i++) {
            graphics.drawLine(0,(HEIGHT/vonal)*i,(WIDTH/vonal)*(i+1), HEIGHT);
        }
        graphics.setColor(Color.MAGENTA);
        for (int i = 0 ; i < vonal; i++) {
            graphics.drawLine((WIDTH/vonal)*i,0,WIDTH, (HEIGHT/vonal)*(i+1));
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