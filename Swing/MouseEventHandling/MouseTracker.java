// Testing Mouse Tracker
import javax.swing.JFrame;
public class MouseTracker
{
       public static void main(String[] args)
       {
               MouseTrackerFrame frame = new MouseTrackerFrame();

               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setSize(300, 300);
               frame.setVisible(true);
       }
}
