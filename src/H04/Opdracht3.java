package H04;


import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {


    public void init ( ) {
    }
    public void paint (Graphics g) {

        g.setColor(Color.black);
        g.fillRect(50,100,5,150);

        g.setColor(Color.red);
        g.fillRect(55,100,70,20);

        g.setColor(Color.WHITE);
        g.fillRect(55,120,70,20);

        g.setColor(Color.blue);
        g.fillRect(55,140,70,20);


    }
}