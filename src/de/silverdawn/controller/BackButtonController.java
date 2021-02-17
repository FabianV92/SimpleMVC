package de.silverdawn.controller;

import de.silverdawn.model.Datamodel;
import de.silverdawn.view.DisplayWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonController implements ActionListener {
    DisplayWindow _displayWindow;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(_displayWindow.get_index() > 0) {
            _displayWindow.set_index(_displayWindow.get_index() - 1);
        }
        _displayWindow.setDisplayLabelText(Datamodel.getInstance()
                .getObjectAtIndex(_displayWindow.get_index()).toString());
    }

    public BackButtonController(DisplayWindow displayWindow){
        _displayWindow = displayWindow;
    }
}
