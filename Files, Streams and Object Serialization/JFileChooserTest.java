// Tests JFileChooserDemo
import javax.swing.JFrame;
import java.io.IOException;

public class JFileChooserTest
{
       public static void main(String[] args) throws IOException
       {
              JFileChooserDemo app = new JFileChooserDemo();
              app.setSize(400, 400);
              app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              app.setVisible(true);
       }
}
