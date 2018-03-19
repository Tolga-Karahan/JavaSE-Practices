// JComboBox that displays a list of image names.
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxFrame extends JFrame
{
        private final JComboBox<String> imagesJComboBox; // holds icon names
        private final JLabel label; // displays selected icon

        private static final String[] names =
               {"C.jpg", "C++.jpg", "Java.png", "SQL.png"};
        private final Icon[] icons =  {
               new ImageIcon(getClass().getResource(names[0])),
               new ImageIcon(getClass().getResource(names[1])),
               new ImageIcon(getClass().getResource(names[2])),
               new ImageIcon(getClass().getResource(names[3]))};

        // ComboBoxFrame constructor add JComboBox to JFrame
        public JComboBoxFrame()
        {
               super("Testing JComboBox");
               setLayout(new FlowLayout());

               imagesJComboBox = new JComboBox<String>(names); // set up JComboBox
               imagesJComboBox.setMaximumRowCount(3); // display three rows

               imagesJComboBox.addItemListener(
                    new ItemListener() // anonymous inner class
                    {
                           // handle JComboBox event
                           @Override
                           public void itemStateChanged(ItemEvent event)
                           {
                                  if(event.getStateChange()
                                      == ItemEvent.SELECTED)
                                      label.setIcon(icons[
                                          imagesJComboBox.getSelectedIndex()]);
                           }
                    }
               ); // end call to addItemListener method

               add(imagesJComboBox);
               label = new JLabel();
               add(label);
        }
}
