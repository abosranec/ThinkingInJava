package head_22.example22_4;

import head_22.example22_2.SwingConsole;

import javax.swing.*;
import java.awt.*;

public class PlaceOnWindow3 extends JFrame {
    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button 2"),
            b3 = new JButton("button 3"),
            b4 = new JButton("button 4"),
            b5 = new JButton("button 5");
    public PlaceOnWindow3() {
        setLayout(null);
        b1.setBounds(10,10,80,40);
        b2.setBounds(10,60,80,40);
        b3.setBounds(10,110,80,40);
        b4.setBounds(10,160,80,40);
        b5.setBounds(10,210,80,40);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }

    public static void main(String[] args) {
        SwingConsole.run(new PlaceOnWindow3(), 400, 400);
    }
}
