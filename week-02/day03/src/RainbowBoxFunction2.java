import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction2 {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        // belerakni array-be és onnan meghívni a színeket
        int[][] rainbow = new int [][]{{255, 0, 0},{255, 127, 0},{255, 255, 0},{0, 255, 0},{0, 0, 255},{139, 0, 255}};
        for (int i= 0; i<6; i++ ) {
            Color newcolor= new Color(rainbow[i][0],rainbow[i][1],rainbow[i][2] ) ;
            RainbowSquare((WIDTH-i*(WIDTH/6)),newcolor ,graphics);


        }
    }
    public static void RainbowSquare(int size, Color color, Graphics smg) {
        smg.setColor(color);
        smg.fillRect(WIDTH/2-size/2, HEIGHT/2-size/2, size, size);
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
