import java.awt.*;
import javax.swing.*;

/**
 * In this Class was created a Snowflake
 */
public class Snowflake extends JPanel {
    public static void main(String[] args) {
        Window w = new Window();
        w.ShowWind();
    }

    /*
      In this method were created all lines, using their coordinates.To finding the
      coordinates of the point we using the trigonometric formulas, which depend on
      the angle of inclination and the length of the line
      For creating lines was used Class Graphics
    */
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        //the first section of snowflake
        //x =400, y = 0, - initial coordinates of construction
        int length = 200; // length of first section
        // Lines 1.1, 1.2, х1 = x+length*cos(60), y1 = y+length*sin(60).
        int x1 = 400 + length * 1 / 2, y1 = ((int) (length * Math.sqrt(3) / 2));
        int x2 = 400 - length * 1 / 2, y2 = ((int) (length * Math.sqrt(3) / 2));
        g.drawLine(400, 0, x2, y2);
        g.drawLine(400, 0, x1, y1);

        // the second sections of snowflake

        // Lines 2.1, 2.2
        length = length / 2;
        g.drawLine(x2, y2, ((int) (x2 - length * Math.sqrt(3) / 2)), y2 + length * 1 / 2);
        g.drawLine(x2, y2, x2, y2 + length);

        //  Lines 2.3, 2.4.   90 degrees, x = 100*0+x1, y = 100*1; 30 degrees, x = length*√3/2, y = 100*1/2;
        g.drawLine(x1, y1, x1, y2 + length);
        g.drawLine(x1, y1, ((int) (x1 + length * Math.sqrt(3) / 2)), y2 + length * 1 / 2);

        //the third section of snowflake

        int x3 = ((int) (500 + length * Math.sqrt(3) / 2)), y3 = y2 + length * 1 / 2;
        int x4 = 500, y4 = y2 + length;
        int x5 = x2, y5 = (y2 + length);
        int x6 = ((int) (300 - length * Math.sqrt(3) / 2)), y6 = y2 + length * 1 / 2;
        length = length / 2;

        // Lines 3.1, 3.2
        g.drawLine(x6, y6, x6 - length, y6);
        g.drawLine(x6, y6, x6 - length * 1 / 2, ((int) (y6 + length * Math.sqrt(3) / 2)));

        // Lines 3.3, 3.4
        g.drawLine(x5, y5, x5 - length * 1 / 2, (int) (y5 + length * Math.sqrt(3) / 2));
        g.drawLine(x5, y5, x5 + length * 1 / 2, ((int) (y5 + length * Math.sqrt(3) / 2)));

        // Lines 3.5, 3.6
        g.drawLine(x4, y4, x4 - length * 1 / 2, ((int) (y4 + length * Math.sqrt(3) / 2)));
        g.drawLine(x4, y4, x4 + length * 1 / 2, ((int) (y4 + length * Math.sqrt(3) / 2)));

        // Lines 3.7, 3.8  , х = АB*cos(60), y = AB*sin(60).
        g.drawLine(x3, y3, x3 + length * 1 / 2, ((int) (y3 + length * Math.sqrt(3) / 2)));
        g.drawLine(x3, y3, x3 + length, y3);

        //the fourth section of snowflake

        int x7 = x6 - length, y7 = y6;
        int x8 = x6 - length * 1 / 2, y8 = ((int) (y6 + length * Math.sqrt(3) / 2));
        int x9 = x5 - length * 1 / 2, y9 = (int) (y5 + length * Math.sqrt(3) / 2);
        int x10 = x5 + length * 1 / 2, y10 = ((int) (y5 + length * Math.sqrt(3) / 2));
        int x11 = x4 - length * 1 / 2, y11 = ((int) (y4 + length * Math.sqrt(3) / 2));
        int x12 = x4 + length * 1 / 2, y12 = ((int) (y4 + length * Math.sqrt(3) / 2));
        int x13 = x3 + length * 1 / 2, y13 = ((int) (y3 + length * Math.sqrt(3) / 2));
        int x14 = x3 + length, y14 = y3;
        length /= 2;

        // Lines 4.1, 4.2
        g.drawLine(x7, y7, x7 - 25, y7 + 25 * 1 / 2);
        g.drawLine(x7, y7, x7 - 25, y7 - 25 * 1 / 2);

        // Lines 4.3, 4.4
        g.drawLine(x8, y8, ((int) (x8 - length * Math.sqrt(3) / 2)), y8 + length * 1 / 2);
        g.drawLine(x8, y8, x8, y8 + length);

        // Lines 4.5, 4.6
        g.drawLine(x9, y9, ((int) (x9 - length * Math.sqrt(3) / 2)), y9 + length * 1 / 2);
        g.drawLine(x9, y9, x9, y9 + length);

        // // Lines 4.7, 4.8
        g.drawLine(x10, y10, x10, y10 + length);
        g.drawLine(x10, y10, x10 + length, y10 + length * 1 / 2);

        // Lines 4.9, 4.10
        g.drawLine(x11, y11, ((int) (x11 - length * Math.sqrt(3) / 2)), y11 + length * 1 / 2);
        g.drawLine(x11, y11, x11, y11 + length);

        // Lines 4.11, 4.12
        g.drawLine(x12, y12, x12, y12 + length);
        g.drawLine(x12, y12, x12 + length, y12 + length * 1 / 2);

        // Lines 4.13, 4.14
        g.drawLine(x13, y13, x13, y13 + length);
        g.drawLine(x13, y13, x13 + length, y13 + length * 1 / 2);

        // Lines 4.15, 4.16
        g.drawLine(x14, y14, x14 + length, y14 + length * 1 / 2);
        g.drawLine(x14, y14, x14 + length, y14 - length * 1 / 2);
    }
}
