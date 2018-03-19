// command buttons and action events
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ButtonFrame extends JFrame
{
      private final JButton plainButton; // button with just text
      private final JButton fancyButton; // button with icons

      // ButtonFrame adds JButtons to JFrame
      public ButtonFrame()
      {
            super("Testing Buttons");
            setLayout(new FlowLayout());

            plainButton = new JButton("Plain Button");
            add(plainButton);

            Icon java1 = new ImageIcon(getClass().getResource("java.png"));
            Icon java2 = new ImageIcon(getClass().getResource("java2.png"));
            fancyButton = new JButton("FancyButton", java1);
            fancyButton.setRolloverIcon(java2);
            fancyButton.setHorizontalTextPosition(SwingConstants.CENTER);
            fancyButton.setVerticalTextPosition(SwingConstants.BOTTOM);
            add(fancyButton);

            // create new ButtonHandler for button event handling
            ButtonHandler handler = new ButtonHandler();
            plainButton.addActionListener(handler);
            fancyButton.addActionListener(handler);
      }

      // inner class for button event handling
      private class ButtonHandler implements ActionListener
      {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                  JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                       "You pressed: %s", event.getActionCommand()));
            }
      }
}
