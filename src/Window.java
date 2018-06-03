import javax.swing.*;
import java.awt.*;

public class Window extends JLabel {
    // There we created a window and set its parameters

    void ShowWind() {
        JFrame frame = new JFrame("Snowflake for CoreValue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(800, 800);
        Snowflake panel = new Snowflake();
        frame.add(panel);
        frame.setVisible(true);
    }
}
