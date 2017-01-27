package window.control;

import java.awt.*;
import java.applet.*;

public class MyWindow2 extends Applet {

    Frame window;
    Button btnOpen, btnClose;

    public void init() {
        btnOpen = new Button("Open Window");
        add(btnOpen);
        btnClose = new Button("Close Window");
        add(btnClose);
        window = new Frame("A Pop Up Window");
        window.resize(150, 150);
        MenuBar mBar = new MenuBar();
        Menu menu = new Menu("File");
        menu.add(new MenuItem("New"));
        menu.add(new MenuItem("Open"));
        menu.add(new MenuItem("Save"));
        mBar.add(menu);
        window.setMenuBar(mBar);
    }

    public boolean action(Event evt, Object arg) {
        if (evt.target instanceof Button) {
            String label = (String) arg;
            if (label.equals("Open Window")) {
                if (!window.isShowing()) {
                    window.show();
                }
            } else {
                if (window.isShowing()) {
                    window.hide();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
