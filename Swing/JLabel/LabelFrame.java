// JLabels with texts and icons
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provide basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame
{
        private final JLabel label1;
        private final JLabel label2;
        private final JLabel label3;

        public LabelFrame()
        {
               super("Testing JLabel");
               setLayout(new FlowLayout());

               // JLabel constructor with a String argument
               label1 = new JLabel("Label with text");
               label1.setToolTipText("This is label1");
               add(label1);

               // JLabel constructor with String, icon and alignment arguments
               Icon bug = new ImageIcon(getClass().getResource("bug.jpg"));
               label2 = new JLabel("Label with text and icon", bug,
                    SwingConstants.RIGHT);
               label2.setVerticalTextPosition(SwingConstants.TOP);
               label2.setHorizontalTextPosition(SwingConstants.RIGHT);
               label2.setToolTipText("This is label2");
               add(label2);

               // JLabel constructor no arguments
               label3 = new JLabel();
               label3.setText("Label with icon and text at bottom");
               label3.setIcon(bug);
               label3.setHorizontalTextPosition(SwingConstants.CENTER);
               label3.setVerticalTextPosition(SwingConstants.BOTTOM);
               label3.setToolTipText("This is label3");
               add(label3);
        }
}
