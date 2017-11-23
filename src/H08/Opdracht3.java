package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    Button ok;
    double getal;
    double totaal;

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("type bedrag zonder BTW:");
        tekstvak.addActionListener(new KnopListenerok());
        add(label);
        add(tekstvak);
        ok = new Button();
        ok.setLabel("OK");
        KnopListenerok aa = new KnopListenerok();
        ok.addActionListener(aa);
        add(ok);

    }

    public void paint(Graphics g) {
        totaal = getal / 100 * 121;
        g.drawString(" bedrag met BTW " + totaal, 50, 60);
    }



    class KnopListenerok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }
}