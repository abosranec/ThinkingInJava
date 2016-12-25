package head_22.example22_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import head_22.example22_2.SwingConsole;

public class CatchAction extends JFrame {
    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button 2");
    private JTextField tf = new JTextField(10);
    private JTextArea ta = new JTextArea(20,20);
    private int counter = 0;

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            tf.setText(name);
            ta.append(counter++ + ": " + name + "\n");
        }
    }

    private ButtonListener bl = new ButtonListener();

    public CatchAction() {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(tf);
        //add(ta);
        add(new JScrollPane(ta));
    }

    public static void main(String[] args) {
        SwingConsole.run(new CatchAction(),600,600);
    }
}
