package head_22.example22_4;

import head_22.example22_2.SwingConsole;

import javax.swing.*;
import java.awt.*;

public class PlaceOnWindow2 extends JFrame {
    public PlaceOnWindow2() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++) {
            add(new JButton("button + " + i));
        }
    }

    public static void main(String[] args) {
        SwingConsole.run(new PlaceOnWindow2(), 400, 400);
    }
}
