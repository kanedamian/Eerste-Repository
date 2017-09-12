package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4  extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(60,250,250,2);

        g.setColor(Color.black);
        g.fillRect(60,50,2,200);

        g.drawLine(60,210,55,210);
        g.drawString("20KG",20,215);

        g.drawLine(60,170,55,170);
        g.drawString("40KG",20,175);

        g.drawLine(60,130,55,130);
        g.drawString("60KG",20,135);

        g.drawLine(60,90,55,90);
        g.drawString("80KG",20,95);

        g.drawLine(60,50,55,50);
        g.drawString("100KG",10,56);

        g.setColor(Color.CYAN);
        g.fillRect(65,170,30,80);
        g.setColor(Color.black);
        g.drawString("Valerie",60,265);

        g.setColor(Color.RED);
        g.fillRect(120,50,30,200);
        g.setColor(Color.black);
        g.drawString("Jeroen",120,265);

        g.setColor(Color.GREEN);
        g.fillRect(175,90,30,160);
        g.setColor(Color.black);
        g.drawString("Hans",175,265);










    }
}
