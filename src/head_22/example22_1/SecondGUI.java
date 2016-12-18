package head_22.example22_1;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

class SecondGUI extends JFrame {
    private JLabel jLabel;
    private static SecondGUI secondGUI;
    public SecondGUI(String title) throws HeadlessException {
        super(title);
        jLabel = new JLabel("old label");
        add(jLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                secondGUI = new SecondGUI("Hello GUI");
            }
        });
        TimeUnit.SECONDS.sleep(3);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                secondGUI.jLabel.setText("new label");
            }
        });
    }
}
