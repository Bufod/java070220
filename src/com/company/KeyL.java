package com.company;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyL extends KeyAdapter {
    private MyView myView;

    public KeyL(MyView myView) {
        this.myView = myView;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (myView != null && e.getKeyCode() == 0){
            myView.dispose();
        } else {
            if (myView != null) {
                myView.getTextEl().setText(myView.getTextEl().getText()+e.getKeyChar());
            }
        }
    }
}
