// Demonstrating mouse clicks and distinguishing between mouse buttons.

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame
{
       private String details; // String displayed in the statusBar
       private final JLabel statusBar; // JLabel at bottom of window

       public MouseDetailsFrame()
       {
              super("Mouse click and buttons");
              setLayout(new BorderLayout());

              statusBar = new JLabel("Click the mouse");
              add(statusBar, BorderLayout.SOUTH);
              addMouseListener(new MouseClickHandler()); // register listener
       }

       private class MouseClickHandler extends MouseAdapter
       {
              // handle mouse-click event and determine which button was pressed
              @Override
              public void mouseClicked(MouseEvent event)
              {
                     int xPos = event.getX();
                     int yPos = event.getY();

                     details = String.format("Clicked %d time(s) ",
                          event.getClickCount());

                     if(event.isMetaDown()) // right mouse button
                          details += "with right mouse button";
                     else if(event.isAltDown()) // center mouse button
                          details += "with center mouse button";
                     else
                          details += "with left mouse button";

                     statusBar.setText(details);
              }
       }
}
