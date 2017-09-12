package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawRect(70,20,100,100);
        g.fillRect(70,20,100,100);

        g.setColor(Color.WHITE);
        g.drawOval(75,25,30,30);
        g.fillOval(75,25,30,30);

        g.setColor(Color.WHITE);
        g.drawOval(135,25,30,30);
        g.fillOval(135,25,30,30);

        g.setColor(Color.WHITE);
        g.drawOval(135,85,30,30);
        g.fillOval(135,85,30,30);

        g.setColor(Color.WHITE);
        g.drawOval(75,85,30,30);
        g.fillOval(75,85,30,30);

    }
}