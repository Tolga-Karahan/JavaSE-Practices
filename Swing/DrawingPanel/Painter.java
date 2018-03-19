// testing PaintPanel
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter
{
       public static void main(String[] args)
       {
              PaintPanel panel = new PaintPanel();
              JFrame application = new JFrame("A simple paint program");
              application.add(panel, BorderLayout.CENTER);

              JLabel label = new JLabel("Drag the mouse to draw");
              application.add(label, BorderLayout.SOUTH);
              application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              application.setSize(400, 200);
              application.setVisible(true);
       }
}
