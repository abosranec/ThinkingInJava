package head_22.example22_4;

import head_22.example22_2.SwingConsole;

import javax.swing.*;

public class PlaceOnWindow5 extends JFrame {
    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button 2"),
            b3 = new JButton("button 3"),
            b4 = new JButton("button 4"),
            b5 = new JButton("button 5");
    public PlaceOnWindow5() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        add(b5);
    }

    public static void main(String[] args) {
        SwingConsole.run(new PlaceOnWindow5(), 400, 400);
    }
}
