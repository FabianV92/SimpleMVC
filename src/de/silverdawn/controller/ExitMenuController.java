package de.silverdawn.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitMenuController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
