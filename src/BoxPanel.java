import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 10/2/17.
 */
public class BoxPanel extends JPanel{

    public BoxPanel(int width, int height){
        setSize(width,height);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;


        int width = getWidth()/8;

        for(int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {

                if(i == 1){
                    g2.fillRect(i*width, j*width, width, width);
                }
                else {
                    g2.drawRect(i * width, j * width, width, width);
                }
            }
        }



    }

}
