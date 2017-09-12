package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50,150,225,150);
        g.drawLine(50,150,130,50);
        g.drawLine(225,150,129,50);

        g.drawRect(50,150,175,100);
        g.drawRect(120,218,25,32);

        g.drawRect(170,170,27,17);


    }
}
