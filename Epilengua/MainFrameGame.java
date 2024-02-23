package Epilengua;

import javax.swing.*;
import java.awt.*;

public class MainFrameGame extends TemplateFrames{
    private TemplateFrames mainFrame;

    private JButton bouton1;
    private JButton bouton2;
    private JButton bouton3;
    private JButton bouton4;

    private JPanel mainPanel = new JPanel();
    public MainFrameGame(){
        mainFrame = new TemplateFrames("Epilengua - The game", mainPanel);
        mainPanel.setLayout(null);

        JPanel panelQuestion = new JPanel();
        panelQuestion.setBackground(Color.decode(getSecondaryColor()));
        panelQuestion.setBounds(100, 80, 700, 100);
        mainPanel.add(panelQuestion);

        //Todo : dans panelQuestion, ajouter GameSet.Question[i] : une question dans chaque questionPanel de chaque Frame.

        //Création des 4 boutons de réponse :
        bouton1 = new JButton();
        bouton2 = new JButton();
        bouton3 = new JButton();
        bouton4 = new JButton();

        bouton1.setBounds(140, 230, 250, 90);
        bouton2.setBounds(510, 230, 250, 90);
        bouton3.setBounds(140, 350, 250, 90);
        bouton4.setBounds(510, 350, 250, 90);
        mainPanel.add(bouton1);
        mainPanel.add(bouton2);
        mainPanel.add(bouton3);
        mainPanel.add(bouton4);
    }
}
