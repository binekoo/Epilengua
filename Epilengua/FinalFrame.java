package Epilengua;

import javax.swing.*;
import java.awt.*;

public class FinalFrame extends TemplateFrames{

    private TemplateFrames finalFrame;

    JPanel mainPanel = new JPanel();

    public FinalFrame(){
        finalFrame = new TemplateFrames("Epilengua - Your score", mainPanel);

        mainPanel.setLayout(null);

        JPanel lastPanel = new JPanel();
        lastPanel.setLayout(null);
        lastPanel.setBackground(Color.decode(getSecondaryColor()));
        lastPanel.setBounds(150, 160,600,200);
        mainPanel.add(lastPanel);

        JLabel titreLabel = new JLabel("Votre Score :");
        titreLabel.setForeground(Color.WHITE);
        titreLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titreLabel.setBounds(240, 70, 200, 30);
        JLabel labelScore = new JLabel(String.valueOf(MainFrameGame.getScore()));
        labelScore.setForeground(Color.WHITE);
        labelScore.setFont(new Font("Arial", Font.BOLD, 20));
        labelScore.setBounds(290, 110, 100, 30);

        lastPanel.add(titreLabel);
        lastPanel.add(labelScore);

    }
}