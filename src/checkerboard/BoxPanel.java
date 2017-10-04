package checkerboard;

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

        //8 x 8 Random Grid!
        //each cell has 50% chance of being a circle or square
        //each cell has 50% chance of being filled or drawn

        int width = getWidth()/8;
        for(int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {

                double rand = Math.random();
                if( rand < .25 ){
                    g2.fillRect(i*width, j*width, width, width);
                }else if( rand < .5){
                    g2.drawRect(i*width, j*width, width, width);

                }else if( rand < .75){
                    g2.drawOval(i*width, j*width, width, width);

                }else{
                    g2.fillOval(i*width, j*width, width, width);
                }

            }
        }


        //checkerboard:
//        int width = getWidth()/8;
//        for(int j = 0; j < 8; j++) {
//            for (int i = 0; i < 8; i++) {
//                if( (i + j) % 2 == 1 ){
//                    g2.fillRect(i*width, j*width, width, width);
//                }
//                else {
//                    g2.drawRect(i * width, j * width, width, width);
//                }
//            }
//        }
        //end checkerboard



    }

}
