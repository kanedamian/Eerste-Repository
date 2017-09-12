package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawRoundRect(40, 20, 60, 125,10,10);
        g.fillRect(40, 20, 60, 125);

        g.setColor(Color.GREEN);
        g.drawOval(55,30,30,30);
        g.fillOval(55,30,30,30);

        g.setColor(Color.ORANGE);
        g.drawOval(55,70,30,30);
        g.fillOval(55,70,30,30);

        g.setColor(Color.RED);
        g.drawOval(55,110,30,30);
        g.fillOval(55,110,30,30);





    }
}