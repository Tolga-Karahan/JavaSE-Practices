// JList that displays a list of colors
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ListSelectionModel;

public class JListFrame extends JFrame
{
       private final JList<String> colorJList; // list to display colorJList
       private static final String[] colorNames = {"Black", "Blue", "Cyan",
            "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink",
            "Dark Gray", "Red", "White", "Yellow"};
       private static final Color[] colors = {Color.BLACK, Color.BLUE,
            Color.CYAN, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
            Color.ORANGE, Color.PINK, Color.DARK_GRAY, Color.RED, Color.WHITE,
            Color.YELLOW};

       // constructor add JScrollPane containing JList to JFrame
       public JListFrame()
       {
            super("List Test");
            setLayout(new FlowLayout());

            colorJList = new JList<String>(colorNames); // list of color names
            colorJList.setVisibleRowCount(5); // display five rows at once

            // do not allow multiple selections
            colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            // add a JScrollPane contaning JList to JFrame
            add(new JScrollPane(colorJList));

            colorJList.addListSelectionListener(
                 new ListSelectionListener() // anonymous inner class
                 {
                       // handle list selection events
                       @Override
                       public void valueChanged(ListSelectionEvent event)
                       {
                              getContentPane().setBackground(
                                   colors[colorJList.getSelectedIndex()]);
                       }
                 }
            );
       }
}
