// Drawing a rainbow using arcs and an array of colors
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel{

       private final static Color VIOLET = new Color(128, 0, 128);
       private final static Color INDIGO = new Color(75, 0, 130);

       // colors to use in the rainbow, starting from innermost
       // The two white entities result in an empty arc in the center

       private Color[] colors =
            { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
              Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

        public DrawRainbow(){
            setBackground(Color.WHITE);
        }

        public void paintCompoment(Graphics g){

            super.paintComponent(g);

            int radius = 20;

            int centerX = getWidth() / 2;
            int centerY = getHeight() - 10;

            for(int counter = colors.length; counter > 0; counter--){

                  g.setColor(colors[counter - 1]);

                  g.fillArc(centerX - radius * counter,
                             centerY - radius * counter,
                             radius * 2 * counter, radius * 2 * counter,
                             0, 180);
            }

        }
}
