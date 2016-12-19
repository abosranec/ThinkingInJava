package head_22.example22_2;

import javax.swing.*;
import java.awt.*;
import static head_22.example22_2.SwingConsole.*;

public class FirstButton extends JFrame {
    JButton jb1, jb2;
    public FirstButton() {
        jb1 = new JButton("button 1");
        jb2 = new JButton("button 2");
        setLayout(new FlowLayout());
        add(jb1);
        add(jb2);
    }

    public static void main(String[] args) {
        run(new FirstButton(),400,400);
    }
}
