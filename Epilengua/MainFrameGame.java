package Epilengua;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class MainFrameGame extends TemplateFrames implements ActionListener {
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
        bouton1.addActionListener(this);
        bouton2 = new JButton();
        bouton2.addActionListener(this);
        bouton3 = new JButton();
        bouton3.addActionListener(this);
        bouton4 = new JButton();
        bouton4.addActionListener(this);

        bouton1.setBounds(140, 230, 250, 90);
        bouton2.setBounds(510, 230, 250, 90);
        bouton3.setBounds(140, 350, 250, 90);
        bouton4.setBounds(510, 350, 250, 90);
        mainPanel.add(bouton1);
        mainPanel.add(bouton2);
        mainPanel.add(bouton3);
        mainPanel.add(bouton4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.dispose();
        mainFrame = new MainFrameGame();
        //Todo : faire un if sur la Réponse récupérée pour savoir si elle est bonne ou pas et adapter la JOptionPane !
        JOptionPane.showMessageDialog(mainFrame,"GG ez noob", "Votre réponse :", INFORMATION_MESSAGE);
    }
}
