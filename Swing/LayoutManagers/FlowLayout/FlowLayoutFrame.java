// FlowLayout allows the components to flow over multiple lines.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
      private final JButton leftJButton; // button to set alignment left
      private final JButton centerJButton; // button to set alignment center
      private final JButton rightJButton; // button to set alignment right
      private final FlowLayout layout; // layout object
      private final Container container; // container to set layout

      public FlowLayoutFrame()
      {
             super("FlowLayout Demo");

             layout = new FlowLayout();
             container = getContentPane(); // get container to layout
             setLayout(layout);

             // set up leftJButton and register listener
             leftJButton = new JButton("Left");
             add(leftJButton);
             leftJButton.addActionListener(
                  new ActionListener()
                  {
                       @Override
                       public void actionPerformed(ActionEvent event)
                       {
                             layout.setAlignment(FlowLayout.LEFT);

                             // reallign attached components
                             layout.layoutContainer(container);
                       }
                  }
             );

             // set up centerJButton and register listener
             centerJButton = new JButton("Center");
             add(centerJButton);
             centerJButton.addActionListener(
                    new ActionListener()
                    {
                           @Override
                           public void actionPerformed(ActionEvent event)
                           {
                                 layout.setAlignment(FlowLayout.CENTER);

                                 // reallign attached components
                                 layout.layoutContainer(container);
                           }
                    }
             );

             // set up rightJButton and register listener
             rightJButton = new JButton("Right");
             add(rightJButton);
             rightJButton.addActionListener(
                   new ActionListener()
                   {
                          @Override
                          public void actionPerformed(ActionEvent event)
                          {
                                layout.setAlignment(FlowLayout.RIGHT);

                                // reallign attached components
                                layout.layoutContainer(container);
                          }
                   }
             );
      }
}
