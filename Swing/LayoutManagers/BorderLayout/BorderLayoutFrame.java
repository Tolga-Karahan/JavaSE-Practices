// BorderLayout containing five buttons
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
       private final JButton[] buttons;
       private final static String[] names = {"Hide North", "Hide South",
            "Hide East", "Hide West", "Hide Center"};
       private final static String[] constants = {BorderLayout.NORTH,
            BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST,
            BorderLayout.CENTER};
       private final BorderLayout layout;

       public BorderLayoutFrame()
       {
             super("BorderLayout Demo");

             layout = new BorderLayout(5, 5);
             setLayout(layout);
             buttons = new JButton[names.length];

             // add JButtons and register listeners for them
             for(int count = 0; count < buttons.length; count++)
             {
                    buttons[count] = new JButton(names[count]);
                    buttons[count].addActionListener(this);
                    add(buttons[count], constants[count]);
             }
       }

       @Override
       public void actionPerformed(ActionEvent event)
       {
             for(JButton button : buttons)
                  if(event.getSource() == button)
                      button.setVisible(false); // hide the button was clicked
                  else
                      button.setVisible(true); // show other buttons

             layout.layoutContainer(getContentPane()); // lay out content pane
       }
}
