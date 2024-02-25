package Epilengua;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameGame extends TemplateFrames implements ActionListener {
    private TemplateFrames mainFrame;

    private static boolean tjrLaMemeQuestion = true;

    private JButton bouton1;
    private JButton bouton2;
    private JButton bouton3;
    private JButton bouton4;
    private int choix;

    private int choix2;

    private static int compteur = 1;

    private int numeroQuestion;

    private boolean bonneReponse = false;

    private static int score = 0;

    private boolean erreur = false;

    public static int getScore() {
        return score;
    }

    private JPanel mainPanel = new JPanel();
    public MainFrameGame(){
        mainFrame = new TemplateFrames("Epilengua - The game", mainPanel);
        mainPanel.setLayout(null);

        JPanel panelQuestion = new JPanel();
        panelQuestion.setBackground(Color.decode(getSecondaryColor()));
        panelQuestion.setBounds(90, 80, 720, 100);
        mainPanel.add(panelQuestion);

        //Todo : dans panelQuestion, ajouter GameSet.Question[i] : une question dans chaque questionPanel de chaque Frame.

        //Céation de la question :
        JLabel questionLabel = new JLabel();

        //Création des 4 boutons de réponse :
        bouton1 = new JButton();
        bouton1.addActionListener(this);
        bouton2 = new JButton();
        bouton2.addActionListener(this);
        bouton3 = new JButton();
        bouton3.addActionListener(this);
        bouton4 = new JButton();
        bouton4.addActionListener(this);

        for (int i = 0; i < compteur && compteur <=5; i++){
            questionLabel.setText(GameSet.questions[i].getQuestion());
            bouton1.setText(GameSet.getReponse(i, 0).getTexte());
            bouton2.setText(GameSet.getReponse(i, 1).getTexte());
            bouton3.setText(GameSet.getReponse(i, 2).getTexte());
            bouton4.setText(GameSet.getReponse(i, 3).getTexte());
            numeroQuestion = i;
        }
        compteur++;
//        erreur = false;

        questionLabel.setBorder(new EmptyBorder(30, 20, 0, 0));
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panelQuestion.add(questionLabel);

        bouton1.setBounds(140, 230, 250, 90);
        bouton2.setBounds(510, 230, 250, 90);
        bouton3.setBounds(140, 350, 250, 90);
        bouton4.setBounds(510, 350, 250, 90);
        mainPanel.add(bouton1);
        mainPanel.add(bouton2);
        mainPanel.add(bouton3);
        mainPanel.add(bouton4);

        if(!tjrLaMemeQuestion){
            erreur = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof AbstractButton) {
            AbstractButton sourceButton = (AbstractButton) e.getSource();
            String buttonText = sourceButton.getText();

            for (int i = 0; i < 4; i++){
                if(buttonText.equals(GameSet.questions[numeroQuestion].getReponse(i).getTexte())){
                    bonneReponse = GameSet.questions[numeroQuestion].getReponse(i).getCorrect();
                }
            }
        }

        if(bonneReponse){
            if(!erreur){
                score++;
                tjrLaMemeQuestion = false;
            }
            choix = JOptionPane.showConfirmDialog(mainFrame,"Excellent travail ! Maintenant essayez la question suivante !", "Bien joué !", JOptionPane.OK_CANCEL_OPTION);

            if(choix == JOptionPane.OK_OPTION) {
                if(numeroQuestion == 4){
                    mainFrame.dispose();
                    FinalFrame finalFrame = new FinalFrame();
                    return;
                } else {
                    mainFrame.dispose();
                    mainFrame = new MainFrameGame();
                    tjrLaMemeQuestion = false;
                }
            }
        } else {
            choix2 = JOptionPane.showConfirmDialog(mainFrame,"Oups, mauvaise réponse... Veuillez réessayer", "Oups :(", JOptionPane.OK_CANCEL_OPTION);
            compteur--;
            score--;
            tjrLaMemeQuestion = true;
            erreur = true;
            if(choix == JOptionPane.OK_OPTION){
                mainFrame.dispose();
                mainFrame = new MainFrameGame();
            }

        }
        //TODO : ajouter le calcul du score
        //TODO : ajouter les icones aux JOptionPanes
        System.out.println("score " + score);
    }
}