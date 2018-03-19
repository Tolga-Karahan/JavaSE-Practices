import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends MyBoundedShape{

      public Rectangle(int x1, int y1, int x2,
          int y2, Color color, int isFill)
      {
             super(x1, y1, x2, y2, color, isFill);
      }

      @Override
      public void draw(Graphics g)
      {
             g.setColor(super.getColor());
             if(isFill == 1)
                   g.fillRect(getX1(), getY1(),
                       getWidth(), getHeight());
             else
                   g.drawRect(getX1(), getY1(),
                       getWidth(), getHeight());
      }
}
