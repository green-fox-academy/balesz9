import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        for (int i= 0; i<3; i++ ){
            int a = (int)(Math.random()*WIDTH);
            int b = (int)(Math.random()*HEIGHT);
            HorizontalDrawer( a,b, graphics);
            System.out.println(a+" "+b);
        }



    }
    public static void HorizontalDrawer(int x1, int y1, Graphics smg) {
        smg.drawLine(x1,y1, x1+0, y1+50 );

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
