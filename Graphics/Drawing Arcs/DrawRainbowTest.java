// Test application to draw a rainbow
import javax.swing.JFrame;

public class DrawRainbowTest{

      public static void main(String[] args){

            DrawRainbow panel = new DrawRainbow();
            JFrame frame = new JFrame();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.setSize(400, 250);
            frame.setVisible(true);
      }
}
