import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

public class DrawPanel extends JPanel
{
      SecureRandom rand;
      Shape[] shapes;
      int size;
      int lineCounter = 0;
      int rectCounter = 0;
      int ovalCounter = 0;

      public DrawPanel(int width, int height, int size)
      {
            rand = new SecureRandom();
            this.size = size;
            shapes = new Shape[size];
            for(int j = 0; j < shapes.length; j++)
            {
                 int i = rand.nextInt(3);

                 if(i == 0)
                 {
                    shapes[j] = new Line(1 + rand.nextInt(width),
                         1 + rand.nextInt(height),
                         1 + rand.nextInt(width),
                         1 + rand.nextInt(height),
                         new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
                         lineCounter++;
                 }
                 else if(i == 1)
                 {
                    shapes[j] = new Rectangle(1 + rand.nextInt(width),
                        1 + rand.nextInt(height),
                        1 + rand.nextInt(width),
                        1 + rand.nextInt(height),
                        new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)),
                        rand.nextInt(2));
                        rectCounter++;
                 }
                 else
                 {
                    shapes[j] = new Oval(1 + rand.nextInt(width),
                         1 +  rand.nextInt(height),
                         1 + rand.nextInt(width),
                         1 + rand.nextInt(height),
                         new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)),
                         rand.nextInt(2));
                         ovalCounter++;
                 }
            }
      }

      public void paintComponent(Graphics g)
      {
            super.paintComponent(g);

            for(Shape shape : shapes)
                 shape.draw(g);
      }

      @Override
      public String toString()
      {
            return String.format("%d lines, %d rectangles, %d ovals",
                 lineCounter, rectCounter, ovalCounter);
      }
}
