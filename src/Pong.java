import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Pong{

    public static void main(String[] args){
            /**Makes the gamevanvas*/
        JFrame frame = new JFrame("PingPong");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(new GameCanvas(), BorderLayout.CENTER);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
