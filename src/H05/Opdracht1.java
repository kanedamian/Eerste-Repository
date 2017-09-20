package H05;

import javafx.scene.paint.Color;

import java.awt.*;

public class Opdracht1{


    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        g.drawRect(100, 100, breedte, hoogte);

        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        g.setColor(java.awt.Color.MAGENTA);
        g.fillRect(315, 100, breedte, hoogte);

        g.setColor(java.awt.Color.BLACK);
        g.drawOval(315, 100, breedte, hoogte);

        g.setColor(java.awt.Color.MAGENTA);
        g.fillOval(315, 225, breedte, hoogte);

    }

}
