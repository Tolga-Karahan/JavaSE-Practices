import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SquareSpiral extends JPanel{

       private final static Color[] colors =
            {Color.YELLOW, Color.RED, Color.BLACK, Color.RED};

       public void paintComponent(Graphics g){

           int centerX = getWidth() / 2;
           int centerY = getHeight() / 2;

           for(int i = 0; i < colors.length; i++){

                 g.setColor(colors[i]);

                 g.drawLine(centerX + i * 50,
                            centerY - i * 50,
                            centerX + i * 50,
                            centerY + (i + 1) * 50);

                 g.drawLine(centerX + i * 50,
                            centerY + (i + 1) * 50,
                            centerX - (i + 1) * 50,
                            centerY + (i + 1) * 50);

                  g.drawLine(centerX - (i + 1) * 50,
                             centerY + (i + 1) * 50,
                             centerX - (i + 1) * 50,
                             centerY - (i + 1) * 50);

                  g.drawLine(centerX - (i + 1) * 50,
                             centerY - (i + 1) * 50,
                             centerX + (i + 1) * 50,
                             centerY - (i + 1) * 50);


           }
       }


}
