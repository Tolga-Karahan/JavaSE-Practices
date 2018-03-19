// PaintPanel to drawing
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel
{
       // list of point references
       private final ArrayList<Point> points = new ArrayList<>();

       // set up GUI and register mouse event handler
       public PaintPanel()
       {
              // handle frame mouse motion event
              addMouseMotionListener(
                   new MouseMotionAdapter()
                   {
                        // store drag points and repaint
                        @Override
                        public void mouseDragged(MouseEvent event)
                        {
                               points.add(event.getPoint());
                               repaint(); // repaint JFrame
                        }
                   }
              );
       }

       // draw ovals in 4-by-4 bounding box at specified locations
       @Override
       public void paintComponent(Graphics g)
       {
             super.paintComponent(g); // clears drawing area

             for(Point point : points)
                  g.fillOval(point.x, point.y, 4, 4);
       }


}
