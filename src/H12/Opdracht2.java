package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {
    Button[] Button;

    public void init() {
        Button = new Button[25];

        for (int teller = 0; teller < Button.length; teller++) {
            Button[teller] = new Button("Do not press");
            add(Button[teller]);
        }
    }
}