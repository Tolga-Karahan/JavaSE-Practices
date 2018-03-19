// Using JPanel to handle complex layouts
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame
{
       private final JPanel buttonPanel;
       private final JButton[] buttons;

       public PanelFrame()
       {
              super("Panel Demo");
              buttonPanel = new JPanel();
              buttons = new JButton[5];
              buttonPanel.setLayout(new GridLayout(1, buttons.length));

              // create and add buttons
              for(int count = 0; count < buttons.length; count++)
              {
                     buttons[count] = new JButton("Button" + (count + 1));
                     buttonPanel.add(buttons[count]);
              }

              add(buttonPanel, BorderLayout.SOUTH);
       }

}
