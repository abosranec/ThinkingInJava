package head_22.example22_4;

import head_22.example22_2.SwingConsole;

import javax.swing.*;
import java.awt.*;

public class PlaceOnWindow6 extends JFrame {
    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button 2"),
            b3 = new JButton("button 3"),
            b4 = new JButton("button 4"),
            b5 = new JButton("button 5");
    public PlaceOnWindow6() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(b4);
        panel2.add(b5);
        //panel2.add(b3);
    }

    public static void main(String[] args) {
        SwingConsole.run(new PlaceOnWindow6(), 400, 400);
    }
}
