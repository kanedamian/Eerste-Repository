package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int a;
    int b;
    int c;


    public void init() {
        a = (60 * 60);
        b = (24 * a);
        c = (365 * b);
    }

    public void paint(Graphics g) {
        g.drawString("In 1 uur zitten :" + a + "seconde",20,20);
        g.drawString("In 1 Dag zitten:" + b + "Seconde",20,35);
        g.drawString("In 1 Jaar zitten:" + c + "Seconde",20,50);



    }
}