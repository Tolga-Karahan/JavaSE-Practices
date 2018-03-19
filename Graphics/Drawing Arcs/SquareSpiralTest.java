import javax.swing.JFrame;

public class SquareSpiralTest{

       public static void main(String[] args){

               SquareSpiral panel = new SquareSpiral();
               JFrame frame = new JFrame();

               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.add(panel);
               frame.setSize(400, 450);
               frame.setVisible(true);
       }
}
