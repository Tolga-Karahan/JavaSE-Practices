// Using fonts
import javax.swing.JFrame;

public class Fonts
{
       public static void main(String[] args)
       {
              FontJPanel panel = new FontJPanel();
              JFrame frame = new JFrame();

              frame.add(panel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setSize(420, 150);
              frame.setVisible(true);
       }
}
