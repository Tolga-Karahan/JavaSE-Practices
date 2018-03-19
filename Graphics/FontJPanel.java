// Display strings in different fonts and colors.
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel
{
        @Override
        public void paintComponent(Graphics g)
        {
              super.paintComponent(g);

              g.setFont(new Font("Serif", Font.BOLD, 12));
              g.drawString("Serif 12 point bold.", 20, 30);

              g.setFont(new Font("Monospaced", Font.ITALIC, 24));
              g.drawString("Monospaced 24 point italic.", 20, 50);

              g.setFont(new Font("SansSerif", Font.PLAIN, 14));
              g.drawString("SansSerif 14 point plain.", 20, 70);

              g.setColor(Color.RED);
              g.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 18));
              g.drawString(g.getFont().getName() + " " + g.getFont().getSize() +
                   " point bold italic.", 20, 90);
        }
}
