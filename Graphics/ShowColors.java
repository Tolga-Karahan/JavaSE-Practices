// Demonstrating colors
import javax.swing.JFrame;

public class ShowColors
{
       public static void main(String[] args)
       {
              JFrame frame = new JFrame("Using Colors");
              ColorJPanel panel = new ColorJPanel();
              frame.add(panel);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setSize(300, 150);
              frame.setVisible(true);
       }
}
