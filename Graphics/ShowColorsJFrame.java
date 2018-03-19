// Choosing colors with JColorChooser
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JColorChooser;

public class ShowColorsJFrame extends JFrame
{
       private final JButton changeColorButton;
       private final JPanel colorPanel;
       private Color color = Color.LIGHT_GRAY;

       public ShowColorsJFrame()
       {
             super("Using JColorChooser");

             colorPanel = new JPanel();
             colorPanel.setBackground(color);

             changeColorButton = new JButton("Change Color");
             changeColorButton.addActionListener(
                   new ActionListener()
                   {
                          @Override
                          public void actionPerformed(ActionEvent event)
                          {
                                 color = JColorChooser.showDialog(
                                    ShowColorsJFrame.this, "Choose a color", color);

                                 if(color == null)
                                     color = Color.LIGHT_GRAY;

                                 colorPanel.setBackground(color);
                          }
                   }
             );

             add(colorPanel, BorderLayout.CENTER);
             add(changeColorButton, BorderLayout.SOUTH);

             setSize(400, 130);
             setVisible(true);
       }
}
