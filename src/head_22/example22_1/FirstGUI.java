package head_22.example22_1;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class FirstGUI {
    public static void main(String[] args) throws Exception {
        JFrame jf = new JFrame("Hello GUI");
        JLabel jl = new JLabel("old label");
        jf.add(jl);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        jf.setVisible(true);
        TimeUnit.SECONDS.sleep(5);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jl.setText("new label");
            }
        });
    }
}
