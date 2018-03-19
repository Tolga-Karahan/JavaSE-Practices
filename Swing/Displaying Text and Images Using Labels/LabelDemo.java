import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo
{
      public static void main(String[] args)
      {
              JLabel northLabel = new JLabel("North");

              ImageIcon labelIcon = new ImageIcon("gslogo.png");
              JLabel centerLabel = new JLabel(labelIcon);

              JLabel southLabel = new JLabel();
              southLabel.setText("South");

              JFrame application = new JFrame();

              application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              application.add(northLabel, BorderLayout.NORTH);
              application.add(centerLabel, BorderLayout.CENTER);
              application.add(southLabel, BorderLayout.SOUTH);

              application.setSize(500, 500);
              application.setVisible(true);

      }

}
