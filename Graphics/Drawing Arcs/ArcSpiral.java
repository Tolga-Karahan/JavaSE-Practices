import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ArcSpiral extends JPanel{

       private final static Color[] colors =
            {Color.MAGENTA, Color.RED, Color.BLACK, Color.BLUE};

       public void paintComponent(Graphics g){

           int centerX = getWidth() / 2;
           int centerY = getHeight() / 2;
           int width = 20;
           int height = 20;

           for(int i = 0; i < colors.length; i++){

                 g.setColor(colors[i]);

                 if(i % 2 == 0)
                 {
                       g.drawArc(centerX, centerY, width, height, 0, 180);
                       centerX += centerX + i * 10;
                       centerY += centerY + i * 10;
                       width *= 2;
                       height *= 2;
                 }

                 else
                 {
                       g.drawArc(centerX, centerY, width, height, 0, -180);
                       centerX += centerX + i * 10;
                       centerY += centerY + i * 10;
                       width *= 2;
                       height *= 2;
                 }


           }
       }


}
