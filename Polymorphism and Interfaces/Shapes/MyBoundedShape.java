import java.awt.Color;
public abstract class MyBoundedShape extends Shape
{
       public int isFill;

       public MyBoundedShape(int x1, int y1, int x2, int y2,
           Color color, int isFill)
       {
            super(x1, y1, x2, y2, color);
            this.isFill = isFill;
       }
       public int getWidth()
       {
             return java.lang.Math.abs(getX2() - getX1());
       }

       public int getHeight()
       {
             return java.lang.Math.abs(getY2() - getY1());
       }


}
