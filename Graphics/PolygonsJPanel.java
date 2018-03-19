import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolygonsJPanel extends JPanel
{
      @Override
      public void paintComponent(Graphics g)
      {
             super.paintComponent(g);

             int[] xValues = {20, 40, 50, 30, 20, 15};
             int[] yValues = {50, 50, 60, 80, 80, 60};
             Polygon polygon1 = new Polygon(xValues, yValues, 6);
             g.drawPolygon(polygon1);

             int[] xValues2 = {70, 90, 100, 80, 70, 65, 60};
             int[] yValues2 = {100, 100, 110, 110, 130, 110, 90};
             g.drawPolyline(xValues2, yValues2, 7);

             int[] xValues3 = {120, 140, 150, 190};
             int[] yValues3 = {40, 70, 80, 60};
             g.fillPolygon(xValues3, yValues3, 4);

             Polygon polygon2 = new Polygon();
             polygon2.addPoint(165, 135);
             polygon2.addPoint(175, 150);
             polygon2.addPoint(270, 200);
             polygon2.addPoint(200, 220);
             polygon2.addPoint(130, 180);
             g.fillPolygon(polygon2);
      }

      public static void main(String[] args)
      {
            JFrame frame = new JFrame();
            PolygonsJPanel panel = new PolygonsJPanel();

            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(280, 270);
            frame.setVisible(true);
      }
}
