// Demonstrates some Java 2D Shapes
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class ShapesJPanel extends JPanel
{
       // draw shapes with Java 2D API
       @Override
       public void paintComponent(Graphics g)
       {
              super.paintComponent(g);
              Graphics2D g2d = (Graphics2D)g; // cast g to Graphics2D

              // draw 2D ellipse filled with a blue-yellow gradient
              g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                   Color.YELLOW, true));
              g2d.fill(new Ellipse2D.Double(3, 30, 65, 100));

              // draw 2D rectangle in red
              g2d.setPaint(Color.RED);
              g2d.setStroke(new BasicStroke(10.0f));
              g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

              // draw 2D rounded rectangle with a buffered background
              BufferedImage buffImage = new BufferedImage(10, 10,
                   BufferedImage.TYPE_INT_RGB);

              // obtaining Graphics2D from buffImage and draw on it
              Graphics2D gg = buffImage.createGraphics();
              gg.setColor(Color.YELLOW);
              gg.fillRect(0, 0, 10, 10);
              gg.setColor(Color.BLACK);
              gg.drawRect(1, 1, 6, 6);
              gg.setColor(Color.BLUE);
              gg.fillRect(1, 1, 3, 3);
              gg.setColor(Color.RED);
              gg.fillRect(4, 4, 3, 3); // draw a filled rectangle

              // paint buffImage onto the JFrame
              g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
              g2d.fill(
                   new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

              // draw 2D pie-shaped arc in white
              g2d.setPaint(Color.WHITE);
              g2d.setStroke(new BasicStroke(6.0f));
              g2d.draw(
                   new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

              // draw 2D lines in green and yellow
              g2d.setPaint(Color.GREEN);
              g2d.draw(new Line2D.Double(395, 30, 320, 150));

              // draw 2D line using stroke
              float[] dashes = {10}; // specify dash pattern
              g2d.setPaint(Color.YELLOW);
              g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
                   BasicStroke.JOIN_ROUND, 10, dashes, 0));
              g2d.draw(new Line2D.Double(320, 30, 395, 150));
       }

       public static void main(String[] args)
       {
              ShapesJPanel panel = new ShapesJPanel();
              JFrame frame = new JFrame("Drawing 2D Shapes");
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.add(panel);
              frame.setSize(425, 200);
              frame.setVisible(true);
       }
}
