// JTextFields and JPasswordFields

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{

       private final JTextField textField1; // text field with set size
       private final JTextField textField2; // text field with text
       private final JTextField textField3; // text field with texet and size
       private final JPasswordField passwordField; // password field with text

       public TextFieldFrame()
       {
             super("Testing JTextField and JPasswordField");
             setLayout(new FlowLayout());

             // construct text field with 10 columns
             textField1 = new JTextField(10);
             add(textField1);

             // construct text field with default text
             textField2 = new JTextField("Enter text here");
             add(textField2);

             // construct text field with default text and 21 columns
             textField3 = new JTextField("Uneditable text field", 21);
             textField3.setEditable(false); // disable editing
             add(textField3);

             // construct password field with default text
             passwordField = new JPasswordField("Hidden text");
             add(passwordField);

             // register event handlers
             TextFieldHandler handler = new TextFieldHandler();
             textField1.addActionListener(handler);
             textField2.addActionListener(handler);
             textField3.addActionListener(handler);
             passwordField.addActionListener(handler);
       }

       // private inner class for event handling
       private class TextFieldHandler implements ActionListener
       {

             //process text field events
             @Override
             public void actionPerformed(ActionEvent event)
             {
                   String string = "";

                   if(event.getSource() == textField1)
                        string = String.format("textField1: %s",
                            event.getActionCommand());

                   if(event.getSource() == textField2)
                        string = String.format("textField2: %s",
                            event.getActionCommand());

                   if(event.getSource() == textField3)
                        string = String.format("textField3: %s",
                            event.getActionCommand());

                   if(event.getSource() == passwordField)
                        string = String.format("passwordField: %s",
                            event.getActionCommand());

                  JOptionPane.showMessageDialog(null, string);
             }
       }

}
