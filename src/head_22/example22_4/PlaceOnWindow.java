package head_22.example22_4;

import head_22.example22_2.SwingConsole;
import javax.swing.*;
import java.awt.*;

public class PlaceOnWindow extends JFrame {
    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button 2"),
            b3 = new JButton("button 3"),
            b4 = new JButton("button 4"),
            b5 = new JButton("button 5");
    public PlaceOnWindow() {
        add(BorderLayout.NORTH, b1);
        add(BorderLayout.SOUTH, b2);
        add(BorderLayout.EAST, b3);
        add(BorderLayout.WEST, b4);
        add(BorderLayout.CENTER, b5);
    }

    public static void main(String[] args) {
        SwingConsole.run(new PlaceOnWindow(), 400, 400);
    }
}
