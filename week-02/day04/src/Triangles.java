import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

      int triangleSide=100;
      int floorNumber=3;
      double triangleHeight=Math.sqrt(3)/2*triangleSide;
      int X = (WIDTH-triangleSide*floorNumber)/2;
      int Y = ((int)Math.round(HEIGHT-floorNumber*triangleHeight))/2;
      for (int i = 0 ; i < floorNumber; i++) {
            int helper = (int)Math.round(HEIGHT-triangleHeight*(floorNumber-i));
            int helper2 =(int)Math.round(HEIGHT-triangleHeight*i);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(X+i*triangleSide, HEIGHT-Y,X+(floorNumber+i)*triangleSide/2,-Y+helper );
            graphics.setColor(Color.RED);
            graphics.drawLine(X+(floorNumber-i)*triangleSide, -Y+HEIGHT,X+(floorNumber-i)*triangleSide/2,-Y+helper );
            graphics.setColor(Color.BLUE);
            graphics.drawLine(X+i*(triangleSide/2),-Y+helper2,X+(triangleSide-i/2)*floorNumber,-Y+ helper2);
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
