package head_22.example22_4;

import head_22.example22_2.SwingConsole;

import javax.swing.*;
import java.awt.*;

public class PlaceOnWindow4 extends JFrame {
    public PlaceOnWindow4() {
        setLayout(null);
        for (int i = 0; i < 20; i++) {
            add(new JButton("button + " + i));
        }
    }

    public static void main(String[] args) {
        SwingConsole.run(new PlaceOnWindow4(), 400, 400);
    }
}
