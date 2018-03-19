import javax.swing.JFrame;

public class ArcSpiralTest{

      public static void main(String[] args){

           ArcSpiral panel = new ArcSpiral();
           JFrame frame = new JFrame();

           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(panel);
           frame.setSize(300,300);
           frame.setVisible(true);
      }
}
