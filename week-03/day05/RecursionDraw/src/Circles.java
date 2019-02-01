import javax.swing.*;

        import java.awt.*;

        import static java.awt.image.ImageObserver.HEIGHT;
        import static java.awt.image.ImageObserver.WIDTH;
        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics) {

        drawCircles(graphics,WIDTH/2,HEIGHT/2, 600);
        //drawConcentricCircle(WIDTH/2,HEIGHT/2,600,graphics);


    }
    public static void drawCircles(Graphics graphics, int xMid, int yMid, int d) {
        // end recursion
        int secondCircleX = (int)((2-Math.sqrt(3))/4*(d/2));
        if(d < 5)
            return;

        // Draw circle

        graphics.drawOval(xMid - d/4, yMid-d/2, d/2 , d/2);
        graphics.drawOval(xMid - secondCircleX, yMid -d/8, d/2, d/2);
        graphics.drawOval(xMid - d/2+secondCircleX, yMid -d/8, d/2 , d/2);



        // start recursion
        //top
        drawCircles(graphics, xMid , yMid - d, d / 2);
        //left
        drawCircles(graphics, xMid +d/2-secondCircleX, yMid + d/2- d/8, d / 2);
        //right
        drawCircles(graphics, xMid -+secondCircleX, yMid+d-d / 8, d/2);
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

