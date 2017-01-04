package head_22.example22_7;//: gui/LookAndFeel.java
// Selecting different looks & feels.
// {Args: motif}
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import head_22.example22_2.SwingConsole;

public class LookAndFeel extends JFrame {
  private String[] choices =
    "Eeny Meeny Minnie Mickey Moe Larry Curly".split(" ");
  private Component[] samples = {
    new JButton("JButton"),
    new JTextField("JTextField"),
    new JLabel("JLabel"),
    new JCheckBox("JCheckBox"),
    new JRadioButton("Radio"),
    new JComboBox(choices),
    new JList(choices),
  };
  public LookAndFeel() {
    super("Look And Feel");
    setLayout(new FlowLayout());
    for(Component component : samples)
      add(component);
  }
  private static void usageError() {
    System.out.println(
      "Usage:LookAndFeel [cross|system|motif]");
    System.exit(1);
  }
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      try {
          switch (Integer.parseInt(bf.readLine())){
              case 0: System.exit(1);
              case 1: UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                  break;
              case 2: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                  break;
              case 3: UIManager.setLookAndFeel("com.sun.java." + "swing.plaf.motif.MotifLookAndFeel");
                  break;
              default: System.out.println("Usage:LookAndFeel [cross|system|motif]");
                  System.exit(1);
                  break;
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
      // Note the look & feel must be set before
    // any components are created.
    SwingConsole.run(new LookAndFeel(), 300, 300);
  }
}
