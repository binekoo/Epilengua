package Epilengua;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGame extends TemplateFrames implements ActionListener{

    private String title = "Bienvenue dans Epilengua !";

    private JPanel mainPanel = new JPanel();

    private JLabel titleLabel;

    private JButton startButton;

    private TemplateFrames homeFrame;

    public HomeGame(){
        homeFrame = new TemplateFrames("Epilengua Home", mainPanel);
        //Ajout des spécificités du panel Home :
        mainPanel.setLayout(null);

        JPanel titlePanel = new RoundedPanel(50, 50);
        titlePanel.setBounds(100, 80, 700, 100);
        titlePanel.setBackground(Color.decode(getSecondaryColor()));

        titleLabel = new JLabel(title);
        titleLabel.setBounds(170, 40, 350, 30);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Avenir", Font.BOLD, 26));
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel);

        startButton = new JButton();
        startButton.setText("Commencer !");
        startButton.setBounds(360, 350, 150, 50);
        startButton.addActionListener(this);
        mainPanel.add(startButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton){
            homeFrame.dispose();
            //TODO : ouvrir une frame principale du jeu !
        }
    }
}
