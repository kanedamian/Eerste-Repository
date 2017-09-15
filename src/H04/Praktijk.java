package H04;

import java.applet.Applet;
import java.awt.*;

public class Praktijk  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawLine(10, 20, 110, 20);

        g.drawRect(10, 40, 100, 50);

        g.drawRoundRect(10, 110, 100, 50, 10, 10);

        g.setColor(Color.magenta);
        g.fillRect(130, 40, 100, 50);
        g.setColor(Color.black);
        g.drawOval(130, 40, 100, 50);

        g.setColor(Color.magenta);
        g.fillOval(130, 110, 100, 50);

        g.setColor(Color.black);
        g.drawOval(250, 40, 100, 50);
        g.setColor(Color.magenta);
        g.fillArc(250, 40, 100, 50, 90, 45);

        g.setColor(Color.BLACK);
        g.drawOval(260, 110, 70, 70);


    }
}