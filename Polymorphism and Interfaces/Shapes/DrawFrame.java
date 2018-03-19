import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class DrawFrame
{
       public static void main(String[] args)
       {
              String size = JOptionPane.showInputDialog(
                   "Enter the number of Shapes to draw");
              DrawPanel panel = new DrawPanel(300, 300, Integer.parseInt(size));
              JFrame frame = new JFrame();
              JLabel label = new JLabel();
              label.setText(panel.toString());

              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.add(panel);
              frame.add(label, BorderLayout.SOUTH);
              frame.setSize(300, 300);
              frame.setVisible(true);

       }
}
