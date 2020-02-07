package com.company;

import javax.swing.*;

public class MyView extends JFrame {
    private JLabel textEl;
    public MyView(){
        super("Мое первое приложение");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

        textEl = new JLabel();
        textEl.setBounds(this.getWidth()/2-150, this.getHeight()/2-25, 300, 50 );

        add(textEl);
        addKeyListener(new KeyL(this));
    }

    public JLabel getTextEl() {
        return textEl;
    }
}
