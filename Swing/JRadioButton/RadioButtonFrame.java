import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame
{
       private final JTextField textField; // used to display font changes
       private final Font plainFont; // font for plain text
       private final Font boldFont;  // font for bold text
       private final Font italicFont; // font for italic text
       private final Font boldItalicFont; // font for bold and italic text
       private final JRadioButton plainJRadioButton; // selects plain text
       private final JRadioButton boldJRadioButton; // selects bold text
       private final JRadioButton italicJRadioButton; // selects italic text
       private final JRadioButton boldItalicJRadioButton; // selects both
       private final ButtonGroup radioGroup; // holds radio buttons

       // RadioButtonFrame constructor adds JRadioButtons to JFrame
       public RadioButtonFrame()
       {
             super("RadioButton test");
             setLayout(new FlowLayout());

             textField = new JTextField("Watch the font style change", 25);
             add(textField); // add textField to JFrame

             plainJRadioButton = new JRadioButton("Plain", true);
             boldJRadioButton = new JRadioButton("Bold", false);
             italicJRadioButton = new JRadioButton("Italic", false);
             boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
             add(plainJRadioButton); // add plain button to JFrame
             add(boldJRadioButton); // add bold button to JFrame
             add(italicJRadioButton); // add italic button to JFrame
             add(boldItalicJRadioButton); // add bold and italic button to JFrame

             // create logical relationship between JRadioButtons
             radioGroup = new ButtonGroup(); // create ButtonGroup
             radioGroup.add(plainJRadioButton); // add plain to Group
             radioGroup.add(boldJRadioButton); // add bold to Group
             radioGroup.add(italicJRadioButton); // add italic to Group
             radioGroup.add(boldItalicJRadioButton); // add both to Group

             // create Font objects
             plainFont = new Font("Serif", Font.PLAIN, 14);
             boldFont = new Font("Serif", Font.BOLD, 14);
             italicFont = new Font("Serif", Font.ITALIC, 14);
             boldItalicFont = new Font("Serif", Font.ITALIC + Font.BOLD, 14);
             textField.setFont(plainFont);

             // register event handlers for JRadioButons
             plainJRadioButton.addItemListener(
                  new RadioButtonHandler(plainFont));
             boldJRadioButton.addItemListener(
                  new RadioButtonHandler(boldFont));
             italicJRadioButton.addItemListener(
                  new RadioButtonHandler(italicFont));
             boldItalicJRadioButton.addItemListener(
                  new RadioButtonHandler(boldItalicFont));

       }

            private class RadioButtonHandler implements ItemListener
            {
                   private Font font;

                   public RadioButtonHandler(Font font)
                   {
                          this.font = font;
                   }

                   @Override
                   public void itemStateChanged(ItemEvent event)
                   {
                          textField.setFont(font);
                   }
            }

}
