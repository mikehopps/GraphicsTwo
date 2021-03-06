import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 10/2/17.
 */
public class BoxMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("TITLE");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height+24));


        JPanel panel = new BoxPanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
