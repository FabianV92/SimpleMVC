package de.silverdawn;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    JMenu myFileMenu;
    JMenuBar myMenuBar;
    JMenuItem myNew;
    JMenuItem myExit;
    JPanel myDataPanel;
    JLabel myNameDisplay;
    JButton myForwardButton;
    JButton myBackButton;

    String[] myNames = {"Alf, 19 Jahre","Bert, 22 Jahre","Cedric, 20 Jahre","Dörte, 18 Jahre"};
    int myIndex = 0;

    public Main(){
        myMenuBar = new JMenuBar();
        myFileMenu = new JMenu("File");
        myNew = new JMenuItem("New");
        myExit = new JMenuItem("Exit");
        myForwardButton = new JButton("Next");
        myBackButton = new JButton("Previous");
        myNameDisplay = new JLabel(myNames[myIndex]);
        myNameDisplay.setPreferredSize(new Dimension(150,32));
        myDataPanel = new JPanel();
        myDataPanel.setLayout(new FlowLayout());
        myDataPanel.setPreferredSize(new Dimension(400,36));
        myDataPanel.add(myBackButton);
        myDataPanel.add(myNameDisplay);
        myDataPanel.add(myForwardButton);

        myExit.addActionListener((a) -> System.exit(0));
        myBackButton.addActionListener((a) -> {
            myIndex--;
            myNameDisplay.setText(myNames[myIndex]);
        });
        myForwardButton.addActionListener((a) -> {
            myIndex++;
            myNameDisplay.setText(myNames[myIndex]);
        });

        myFileMenu.add(myNew);
        myFileMenu.add(myExit);
        myMenuBar.add(myFileMenu);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Simple MVC App");
        this.setJMenuBar(myMenuBar);
        SpringLayout mainLayout = new SpringLayout();
        this.setLayout(mainLayout);
        this.add(myDataPanel);
        this.setSize(400,300);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

}
