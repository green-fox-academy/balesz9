import javax.swing.*;

        import java.awt.*;

        import static java.awt.image.ImageObserver.HEIGHT;
        import static java.awt.image.ImageObserver.WIDTH;
        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics) {

        drawCircles(graphics,WIDTH/2,HEIGHT/2, 300);
        //drawConcentricCircle(WIDTH/2,HEIGHT/2,600,graphics);

    }
    public static void drawCircles(Graphics graphics, int x, int y, int r) {
        // end recursion
        int secondCircleX = (int)((2-Math.sqrt(3))/4*(r));
        if(r < 5)
            return;


        // Draw circle

        graphics.drawOval(x - r/2, y-r, r , r);
        graphics.drawOval(x - secondCircleX, y -r/4, r, r);
        graphics.drawOval(x - r+secondCircleX, y -r/4, r , r);



        // start recursion
        //top
        drawCircles(graphics, x -r/2, y , r / 2);
        /*//left
        drawCircles(graphics, x +d/2-secondCircleX, y + d/2- d/8, d / 2);
        //right
        drawCircles(graphics, x -+secondCircleX, y+d-d / 8, d/2);*/
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

