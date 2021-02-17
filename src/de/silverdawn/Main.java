package de.silverdawn;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {

    private JMenu _fileMenu;
    private JMenuBar _menuBar;
    private JMenuItem _newMenuItem;
    private JMenuItem _exitMenuItem;
    private JPanel _dataDisplayPanel;
    private JLabel _nameDisplayLabel;
    private JButton _forwardButton;
    private JButton _backButton;

    private Datamodel _data = new Datamodel();

    private int _index = 0;

    public Main(){

        _menuBar = new JMenuBar();
        _fileMenu = new JMenu("File");
        _newMenuItem = new JMenuItem("New");
        _exitMenuItem = new JMenuItem("Exit");
        _forwardButton = new JButton("Next");
        _backButton = new JButton("Previous");
        _nameDisplayLabel = new JLabel(_data.get_data().get(_index).toString());
        _nameDisplayLabel.setPreferredSize(new Dimension(150,32));
        _dataDisplayPanel = new JPanel();
        _dataDisplayPanel.setLayout(new FlowLayout());
        _dataDisplayPanel.setPreferredSize(new Dimension(400,36));
        _dataDisplayPanel.add(_backButton);
        _dataDisplayPanel.add(_nameDisplayLabel);
        _dataDisplayPanel.add(_forwardButton);

        _exitMenuItem.addActionListener((a) -> System.exit(0));
        _backButton.addActionListener((a) -> {
            _index--;
            _nameDisplayLabel.setText(_data.get_data().get(_index).toString());
        });
        _forwardButton.addActionListener((a) -> {
            _index++;
            _nameDisplayLabel.setText(_data.get_data().get(_index).toString());
        });

        _fileMenu.add(_newMenuItem);
        _fileMenu.add(_exitMenuItem);
        _menuBar.add(_fileMenu);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Simple MVC App");
        this.setJMenuBar(_menuBar);
        SpringLayout mainLayout = new SpringLayout();
        this.setLayout(mainLayout);
        this.add(_dataDisplayPanel);
        this.setSize(400,300);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

}
