import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesDemo {
    public static void mainDraw(Graphics graphics) {

        int triangleSide=200;
        int floorNumber=3;
        double triangleHeight=Math.sqrt(3)/2*triangleSide;
        int X = (WIDTH-triangleSide*floorNumber)/2;
        int Y = ((int)Math.round(HEIGHT-floorNumber*triangleHeight))/2;
        for (int i = 0 ; i < floorNumber; i++) {
            int helper = (int)Math.round(HEIGHT-triangleHeight*(floorNumber-i));
            int helper2 =(int)Math.round(HEIGHT-triangleHeight*i);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(X+i*triangleSide, HEIGHT-Y,X+floorNumber*triangleSide/2+triangleSide/2*i,-Y+helper );
            graphics.setColor(Color.RED);
            graphics.drawLine(X+(floorNumber-i)*triangleSide, -Y+HEIGHT,X+floorNumber*triangleSide/2-triangleSide/2*i,-Y+helper );
            graphics.setColor(Color.BLUE);
            graphics.drawLine(X+i*(triangleSide/2),-Y+helper2,X+triangleSide*floorNumber-i*triangleSide/2,-Y+ helper2);
        }
        /** graphics.setColor(Color.BLACK);
            for (int i= 0; i<floorNumber; i++) {
            int helper =(int)Math.round(HEIGHT-triangleHeight*floorNumber);
            graphics.drawLine(X+triangleSide/2*(i+3),HEIGHT-Y,X+triangleSide/2*(i+3),-Y+helper);
        } */
            graphics.setColor(Color.BLACK);
            for (int i= 0; i<floorNumber*2-1; i++) {
            int helper =(int)Math.round(HEIGHT-triangleHeight*floorNumber);
            if (i == floorNumber-1){} else {
            graphics.drawLine(X+triangleSide/2*(i+1),HEIGHT-Y,X+triangleSide/2*(i+1),-Y+helper);}
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
