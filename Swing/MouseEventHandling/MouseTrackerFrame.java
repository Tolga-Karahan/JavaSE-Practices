// Demonstrates mouse event handling
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MouseTrackerFrame extends JFrame
{
       private final JPanel mousePanel; // panel in which mouse events occur
       private final JLabel statusLabel; // displays event information

       public MouseTrackerFrame()
       {
              super("Demonsrating Mouse Events");
              setLayout(new BorderLayout());

              mousePanel = new JPanel();
              mousePanel.setBackground(Color.WHITE);
              add(mousePanel, BorderLayout.CENTER);

              statusLabel = new JLabel("Mouse outside JPanel");
              add(statusLabel, BorderLayout.SOUTH);

              // create and register listener for mouse Events
              MouseHandler handler = new MouseHandler();
              mousePanel.addMouseListener(handler);
              mousePanel.addMouseMotionListener(handler);
       }

       private class MouseHandler implements MouseListener,
             MouseMotionListener
       {
             // Mouse Listener event handlers
             // handle event when mouse released immediately after press
             @Override
             public void mouseClicked(MouseEvent event)
             {
                    statusLabel.setText(String.format("Clicked at " +
                    "[%d, %d]", event.getX(), event.getY()));
             }

             // handle event when mouse pressed
             @Override
             public void mousePressed(MouseEvent event)
             {
                    statusLabel.setText(String.format("Pressed at " +
                    "[%d, %d]", event.getX(), event.getY()));
             }

             // handle event when mouse released
             @Override
             public void mouseReleased(MouseEvent event)
             {
                    statusLabel.setText(String.format("Released at " +
                    "[%d, %d]", event.getX(), event.getY()));
             }

             // handle event when mouse enters area
             @Override
             public void mouseEntered(MouseEvent event)
             {
                    statusLabel.setText(String.format("Mouse entered at "
                     + "[%d, %d]", event.getX(), event.getY()));
                    mousePanel.setBackground(Color.GREEN);
             }

             // handle event when mouse exits area
             @Override
             public void mouseExited(MouseEvent event)
             {
                    statusLabel.setText("Mouse outside JPanel");
                    mousePanel.setBackground(Color.WHITE);
             }

             // MouseMotionListener event handlers
             // handle event when mouse dragged with button pressed
             @Override
             public void mouseDragged(MouseEvent event)
             {
                   statusLabel.setText(String.format("Dragged at " +
                   "[%d, %d]", event.getX(), event.getY()));
             }

             // handle event when mouse moved without button pressed
             @Override
             public void mouseMoved(MouseEvent event)
             {
                   statusLabel.setText(String.format("Moved at " +
                   "[%d, %d]", event.getX(), event.getY()));
             }
        }     
}
