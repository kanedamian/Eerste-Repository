package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet {
    int uitkomst;

    public void init() {
        uitkomst = 2 + 2;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}