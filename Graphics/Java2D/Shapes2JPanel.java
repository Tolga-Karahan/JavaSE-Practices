// Demonstratingg a general path.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Shapes2JPanel extends JPanel
{
       // draw general paths
       @Override
       public void paintComponent(Graphics g)
       {
              super.paintComponent(g);
              SecureRandom random = new SecureRandom();

              int[] xPoints = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
              int[] yPoints = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};

              Graphics2D g2d = (Graphics2D)g;
              GeneralPath star = new GeneralPath();

              // set the initial coordinate of the GeneralPath
              star.moveTo(xPoints[0], yPoints[0]);

              for(int count = 1; count < xPoints.length; count++)
                    star.lineTo(xPoints[count], yPoints[count]);

              star.closePath();

              // translate origin to (150, 150)
              g2d.translate(150, 150);

              for(int count = 1; count <= 20; count++)
              {
                    g2d.rotate(Math.PI / 10); // rotate coordinate system

                    // set random drawing color
                    g2d.setColor(new Color(random.nextInt(256),
                         random.nextInt(256), random.nextInt(256)));
                    g2d.fill(star); // draw filled star
              }
       }

       public static void main(String[] args)
       {
             JFrame frame = new JFrame("Drawing 2D Shapes");
             Shapes2JPanel panel = new Shapes2JPanel();
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.add(panel);
             frame.setBackground(Color.WHITE);
             frame.setSize(315, 330);
             frame.setVisible(true);
       }

}
